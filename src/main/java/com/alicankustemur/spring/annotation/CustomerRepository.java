package com.alicankustemur.spring.annotation;

public interface CustomerRepository
{
	public Customer getCustomerByName(String name);

	public void save(Customer customer);

	// ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	// FactoryBean object context.getBean("&customerRepository");

}
