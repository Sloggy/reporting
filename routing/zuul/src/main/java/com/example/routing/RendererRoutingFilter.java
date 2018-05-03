package com.example.routing;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RendererRoutingFilter extends ZuulFilter {

	private final DiscoveryClient fDiscoveryClient;

	public RendererRoutingFilter(final DiscoveryClient pDiscoveryClient) {
		fDiscoveryClient = pDiscoveryClient;
	}

	@Override
	public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String service = context.getRequest().getParameter("service");
        List<ServiceInstance> instances = fDiscoveryClient.getInstances(service);
        try {
            if (instances != null && instances.size() > 0) {
                context.setRouteHost(instances.get(0).getUri().toURL());
            } else {
                throw new IllegalStateException("Target service instance not found!");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Couldn't get service URL!", e);
        }
        return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "route";
	}

}
