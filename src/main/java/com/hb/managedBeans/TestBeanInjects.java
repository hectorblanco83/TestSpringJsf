package com.hb.managedBeans;

import com.hb.services.TestService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;


/**
 * Managed Bean that resolve spring dependency using {@link Inject}.
 */
@RequestScoped
@ManagedBean(name = "beanInjects")
public class TestBeanInjects {
	
	//@Inject
	private TestService testService;
	
	
	public String getText() {
		return "TestBeanInjects: " /*+ testService.getServiceText()*/;
	}
	
	
	public void setText(String text) {
		System.out.println("TestBeanInjects.setText: " + text);
	}
	
	
}