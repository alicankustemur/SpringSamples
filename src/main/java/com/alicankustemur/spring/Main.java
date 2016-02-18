package com.alicankustemur.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Phone phone = applicationContext.getBean("phone", Phone.class);
		System.out.println(phone);

		Customer customer = applicationContext.getBean("customer", Customer.class);
		System.out.println(customer);

		OtherCustomers otherCustomers = applicationContext.getBean("otherCustomers", OtherCustomers.class);
		System.out.println(otherCustomers);

		Car car = applicationContext.getBean("car", Car.class);
		System.out.println(car);

		ListInjectionImpl listInjection = applicationContext.getBean("listInjection", ListInjectionImpl.class);
		System.out.println(listInjection);

		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}
