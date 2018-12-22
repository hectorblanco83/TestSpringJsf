package com.hb.services;

import org.springframework.stereotype.Service;


/**
 * Spring service bean. Use @{@link Service} stereotype to indicate that this is a Bean
 */
@Service("testService")
public class TestService {
	
	
	public String getServiceText() {
		return "This is a spring service's message";
	}
	
}
