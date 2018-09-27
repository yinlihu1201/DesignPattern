package com.tiger.creational.singleton;

public class Client {
	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		System.out.println(instance == instance2);
		StarvingSingleton in = StarvingSingleton.getInstance();
		StarvingSingleton in2 = StarvingSingleton.getInstance();
		System.out.println(in == in2);
	}
}
