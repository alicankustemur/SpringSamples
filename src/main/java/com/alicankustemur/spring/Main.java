package com.alicankustemur.spring;

import java.sql.Connection;

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

		AClass a = applicationContext.getBean("aClass", AClass.class);
		System.out.println(a.doA("Unreplaced."));

		DBSingleton dbSingleton = applicationContext.getBean("dbSingleton", DBSingleton.class);
		Connection connection = dbSingleton.getConnection();

		if (connection == null)
		{
			System.out.println("Bağlantı işlemleri tamamlanmamış.");

		}

		OracleDataSource oracleDataSource = applicationContext.getBean("oracleDataSource", OracleDataSource.class);
		System.out.println(oracleDataSource.getDbConfiguration().getProperty("db.name"));

		Customer testCustomer = applicationContext.getBean("testCustomer", Customer.class);
		System.out.println(testCustomer);

		Car testCar = applicationContext.getBean("testCar", Car.class);
		System.out.println(testCar.getModel());

		Test test = applicationContext.getBean("spelTestValue", Test.class);
		System.out.println(test.getTest());

		Test dbName = applicationContext.getBean("dbName", Test.class);
		System.out.println(dbName.getTest());

		Test number = applicationContext.getBean("spelTestNumber", Test.class);
		System.out.println(number.getTest());

		Test boolean1 = applicationContext.getBean("spelTestBoolean", Test.class);
		System.out.println(boolean1.getTest());

		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}
