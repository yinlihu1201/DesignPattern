package com.tiger.structural.proxy;
/**
 * 
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问\
 * 
 * 代理模式、适配器模式、装饰模式的区别：
		适配器模式（特点在于兼容，必须同时持有原对象，适配对象，目标对象）：新系统因为接口不兼容而不能调用原接口，用新接口来调用原接口，让原接口对新系统时不可见的，新系统通过调用新接口让原接口可用。
		装饰器模式（特点在于增强，必须持有被装饰的对象）：给被装饰这新增功能，并且原封不动的调用原接口。
		代理模式（特点在于隔离，必须持有被代理的对象）:为被代理的类扩充新功能（和装饰器模式类似），但是代理模式具有控制被代理类的访问等性质（就是创建了被代理类的对象），而装饰器模式紧紧是单纯的扩展新功能。
 * 
 * 
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Proxy proxy = new Proxy(new SchoolGirl("小红"));
		proxy.giveDolls();
		proxy.giveFlowers();
	}
}
