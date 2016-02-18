package com.alicankustemur.spring;

public class Car
{
	private String		model;
	private Customer	customer;

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	@Override
	public String toString()
	{
		return "Car [model=" + model + ", customer=" + customer + "]";
	}

}
