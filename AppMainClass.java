package com.mavenproject.maven_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mavenproject.bean.CartEntity;
import com.mavenproject.bean.OrderEntity;
import com.mavenproject.bean.UserEntity;
import com.mavenproject.config.AppConfig;
import com.mvn.scope.Pepsi;
import com.mvn.scope.Soda;

public class AppMainClass
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Pepsi pepsi = context.getBean(Pepsi.class);
    	Soda sodaObj = pepsi.getSodaObj();
    	System.out.println(pepsi);
    	System.out.println(sodaObj);
    	
    	Pepsi pepsi2 = context.getBean(Pepsi.class);
    	Soda sodaObj2 = pepsi2.getSodaObj();
    	System.out.println(pepsi2);
    	System.out.println(sodaObj2);
    }
}
