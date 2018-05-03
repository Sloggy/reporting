package com.example.routing;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("renderer")
public class RendererProperties {

	/**
	 * The services name used to render a document. Names are those used in eureka server.
	 */
	private Set<String> services = new HashSet<>();

	/**
	 * @param pServices the services name stored in eureka
	 */
	public void setServices(final Set<String> pServices) {
		services = pServices;
	}

	public Set<String> getServices() {
		return services;
	}
}
