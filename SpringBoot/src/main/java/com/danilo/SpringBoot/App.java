package com.danilo.SpringBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danilo.beans.Mundo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	ApplicationContext appContext = new
    			ClassPathXmlApplicationContext("com/danilo/xml/beans.xml");
    			 Mundo m = (Mundo)appContext.getBean("mundo");
    			 System.out.println(m.getSaludo());
    			 ((ConfigurableApplicationContext)appContext).close();

    }
}
