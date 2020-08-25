package com.cloudera.demo;

import org.springframework.stereotype.Component;

@Component
public class Processor {
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	String brand;
	String cost;
	public void show()
	{
		System.out.println("Processor");
	}

}
