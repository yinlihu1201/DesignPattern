package com.tiger.creational.simplefactory;

public abstract class Operation {
	protected double numA = 0;
	protected double numB = 0;
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
