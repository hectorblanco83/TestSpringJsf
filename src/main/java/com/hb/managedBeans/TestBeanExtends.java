package com.hb.managedBeans;

import com.hb.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 * Managed Bean that extends SpringBeanAutowiringSupport in order to resolve {@link Autowired} spring dependencies.
 */
@RequestScoped
@ManagedBean(name = "beanExtends")
public class TestBeanExtends extends SpringBeanAutowiringSupport {
	
	@Autowired
	private TestService testService;
	
	
	public String getText() {
		return "TestBeanExtends: " + testService.getServiceText();
	}
	
	
	public void setText(String text) {
		System.out.println("TestBeanExtends.setText: " + text);
	}
	
}