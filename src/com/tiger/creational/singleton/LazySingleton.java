package com.tiger.creational.singleton;
/**
 * 线程安全-懒汉单例模式
 * @author yinlihu
 *
 */
public class LazySingleton {
	private static LazySingleton singleton = null;
	
	private LazySingleton(){
	}
	
	public static LazySingleton getInstance(){
		if(singleton == null){
			synchronized (LazySingleton.class) {
				// 此处判断是为了防止已经创建对象的类进入锁中，导致再次创建对象（因为你是判断完是否为null后再进入锁的，之后进入锁的不一定为null）
				if(singleton == null){
					singleton = new LazySingleton();
				}
			}
		}
		return singleton;
	}
	
}
