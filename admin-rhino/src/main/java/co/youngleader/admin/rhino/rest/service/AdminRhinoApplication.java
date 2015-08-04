package co.youngleader.admin.rhino.rest.service;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class AdminRhinoApplication extends ResourceConfig {

	public AdminRhinoApplication() {
		register(RequestContextFilter.class);
		//register(JacksonFeature.class);
		
		//My RestService
		register(PodcastRestService.class);
	}
}
