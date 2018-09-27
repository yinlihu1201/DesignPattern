package com.tiger.creational.singleton;
/**
 * 线程安全-饿汉模式
 * @author yinlihu
 *
 */
public class StarvingSingleton {
	private static final StarvingSingleton instance = new StarvingSingleton();
	
	private StarvingSingleton(){
	}
	
	public static StarvingSingleton getInstance(){
		return instance;
	}
}
