package com.alicankustemur.spring.annotation;

import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rentalService")
public class RentalServiceImpl implements RentalService
{
	private CustomerRepository	customerRepository;
	private RentalRepository	rentalRepository;
	private Properties			carProperty;

	public Properties getCarProperty()
	{
		return carProperty;
	}

	public void setCarProperty(Properties carProperty)
	{
		this.carProperty = carProperty;
	}

	//@ConstructorProperties({"rentalRepository", "customerRepository"})
	@Autowired
	public RentalServiceImpl(RentalRepository rentalRepository, CustomerRepository customerRepository)
	{
		super();
		this.customerRepository = customerRepository;
		this.rentalRepository = rentalRepository;
	}

	public Rental rentACar(String customerName, Car car, Date begin, Date end)
	{

		Customer customer = customerRepository.getCustomerByName(customerName);
		if (customer == null)
		{
			customer = new Customer(customerName);
		}

		Rental rental = new Rental();
		rental.setCar(car);
		rental.setCustomer(customer);
		rentalRepository.save(rental);
		return rental;
	}

}
