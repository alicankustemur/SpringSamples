package com.alicankustemur.spring.annotation;

public class Car
{

	public static enum CarType
	{
		BUS, CAR, SPORT
	}

	private String	name;
	private CarType	type;

	public Car(CarType type)
	{
		super();
		this.type = type;
	}

	public Car(String name, CarType type)
	{
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "Car [name=" + name + ", type=" + type + "]";
	}

}
