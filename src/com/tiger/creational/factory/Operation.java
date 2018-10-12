package com.tiger.creational.factory;

public abstract class Operation {
	protected double numA;
	protected double numB;
	
	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}
	
	public abstract double getResult();
}
