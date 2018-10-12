package com.tiger.creational.singleton;
/**
 * 单例模式:保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 
 * 应用场景：
	    当一个类在使用中有且只需要被创建一次，那么就需要用到单例模式。
	    
 * 
 * @author yinlihu
 *
 */
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
