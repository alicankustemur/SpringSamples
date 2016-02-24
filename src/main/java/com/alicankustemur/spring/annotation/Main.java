package com.alicankustemur.spring.annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alicankustemur.spring.annotation.Car.CarType;

public class Main
{

	public static void main(String[] args) throws ParseException
	{

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationApplicationContext.xml");
		//RentalService rentalService = (RentalService) applicationContext.getBean("rentalService");
		RentalService rentalService = applicationContext.getBean("rentalService", RentalService.class);
		Rental rental = rentalService.rentACar("Ali Can Kuştemur", new Car("Ford Mustang", CarType.CAR),
				getRentalBegin(), getRentalEnd());
		System.out.println("Rental status : " + rental.isRented());

	}

	public static Date getRentalBegin() throws ParseException
	{
		return new SimpleDateFormat("dd/MM/yy").parse("17/02/2016");
	}

	public static Date getRentalEnd() throws ParseException
	{
		return new SimpleDateFormat("dd/MM/yy").parse("25/02/2016");
	}

}
