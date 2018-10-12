package com.tiger.structural.facade;

public class Facade {
	private SubSystemOne one ;
	private SubSystemTwo two;
	private SubSystemThree three;
	
	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
	}
	
	public void methodA(){
		System.out.println("===============方法组A===============");
		one.methodOne();
		three.methodThree();
	}
	
	public void methodB(){
		System.out.println("===============方法组B===============");
		two.methodTwo();
		three.methodThree();
	}
}
