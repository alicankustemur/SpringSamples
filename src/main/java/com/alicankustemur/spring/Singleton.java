package com.alicankustemur.spring;

public abstract class Singleton
{
	private Phone phone;

	public Singleton()
	{
	}

	public void doSomething()
	{
		createPrototype().foo();
	}

	protected abstract Phone createPrototype();

}
