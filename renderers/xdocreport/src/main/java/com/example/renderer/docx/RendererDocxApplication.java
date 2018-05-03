package com.example.renderer.docx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@Configuration
@EnableConfigurationProperties(RendererProperties.class)
public class RendererDocxApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendererDocxApplication.class, args);
	}
}
