package com.alicankustemur.spring;

import java.util.List;

public class ListInjectionImpl implements ListInjection
{
	private List<Car> carList;

	public List<Car> getCarList()
	{
		return carList;
	}

	public void setCarList(List<Car> carList)
	{
		this.carList = carList;
	}

	@Override
	public String toString()
	{
		return "ListInjectionImpl [carList=" + carList + "]";
	}

}
