package model;

import Factory.AbstractFactory;

public class FashionStore {
	
	AbstractFactory factory;
	Shirt shirt;
	Pants pants;

	public FashionStore(AbstractFactory factory) {
		
		this.factory = factory;
	}
	
	public Shirt produceShirt() {
		
		shirt = factory.createShirt();
		System.out.println(shirt.getName() + " successfully created");
		
		return shirt;
	}
	
	public Pants producePants() {
		
		pants = factory.createPants();
		System.out.println(pants.getName() + " successfully created");
		
		return pants;
	}
	
	public void produceAll() {
		shirt = factory.createShirt();
		pants = factory.createPants();
		
		System.out.println(shirt.getName() + " & " 
		+ pants.getName() + " successfully created  ");
	}
	
	
}
