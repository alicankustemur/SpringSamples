package com.alicankustemur.spring.annotation;

public class Rental
{

	private Car			car;
	private Customer	customer;
	private boolean		rented;
	private String		name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCar(Car car)
	{
		this.car = car;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public boolean isRented()
	{
		return rented;
	}

	public void setRented(boolean rented)
	{
		this.rented = rented;
	}

	public Car getCar()
	{
		return car;
	}

	public Customer getCustomer()
	{
		return customer;
	}

}
