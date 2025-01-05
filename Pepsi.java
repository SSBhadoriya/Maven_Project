package com.mvn.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;



public class Pepsi {

	@Autowired Soda sodaObj;
	public Pepsi()
	{
		System.out.println("Pepsi is very cool!!! ");
		
	}
	public Soda getSodaObj() {
		return sodaObj;
	}
	public void setSodaObj(Soda sodaObj) {
		this.sodaObj = sodaObj;
	}
	
	
}
