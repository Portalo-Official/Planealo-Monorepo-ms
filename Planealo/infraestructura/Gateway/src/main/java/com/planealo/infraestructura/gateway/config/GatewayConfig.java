package com.planealo.infraestructura.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	private static final String rutaApi = "/planealo/api/v1/";

	
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("customer-ms",
						p -> p.path(rutaApi+"customers/**")
								.filters(f -> f.rewritePath(rutaApi+"(?<remaining>.*)", "/${remaining}"))
								.uri("lb://customer-ms"))
				.route("plan-ms",
						p -> p.path(rutaApi+"planes/**")
								.filters(f -> f.rewritePath(rutaApi+"(?<remaining>.*)", "/${remaining}"))
								.uri("lb://plan-ms"))
				.route("plan-ms",
						p -> p.path(rutaApi+"miembros/**")
								.filters(f -> f.rewritePath(rutaApi+"(?<remaining>.*)", "/${remaining}"))
								.uri("lb://plan-ms"))
				.build();
	}
}
