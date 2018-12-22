package com.hb.managedBeans;

import com.hb.services.TestService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


/**
 * Managed Bean that resolve spring dependency using {@link ManagedProperty}.
 */
@RequestScoped
@ManagedBean(name = "beanProperty")
public class TestBeanManagedProperty {
	
	//@ManagedProperty(value = "#{testService}")
	private TestService testService;
	
	
	public String getText() {
		return "TestBeanManagedProperty: " /*+ testService.getServiceText()*/;
	}
	
	
	public void setText(String text) {
		System.out.println("TestBeanManagedProperty.setText: " + text);
	}
	
	
}