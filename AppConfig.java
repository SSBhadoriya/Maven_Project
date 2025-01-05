package com.mavenproject.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.mavenproject.bean.CartEntity;
import com.mvn.scope.Pepsi;
import com.mvn.scope.Soda;

@Configuration
@ComponentScan(basePackages = {"com.mavenproject.bean","com.mvn.scope"})
public class AppConfig {

	@Bean
	public CartEntity cartEntity()
	{
		return new CartEntity();
	}
// Pepsi Singleton and Soda Prototype having some issue during execution (same data for Soda). So we will use ProxyMode concept	
	@Bean
	@Scope(value="singleton")
//	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Pepsi pepsi()
	{
		return new Pepsi();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
//	@Scope(value="singleton")
	public Soda soda()
	{
		return new Soda();
	}
	
}
