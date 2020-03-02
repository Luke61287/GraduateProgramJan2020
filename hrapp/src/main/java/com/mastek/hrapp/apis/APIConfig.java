package com.mastek.hrapp.apis;

import org.springframework.stereotype.Component;
import org.glassfish.jersey.server.ResourceConfig;
import com.mastek.hrapp.services.EmployeeService;

@Component
public class APIConfig 
	extends ResourceConfig{
		// configure the Service classes using ResourceConfig.
		
	public APIConfig() {
		// enable the CORS filter for UI applications to access the service.
		register(CORSFilter.class);
		
		// register each Service class to enable services as API.
		register(EmployeeService.class);
		
	}

}