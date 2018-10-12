package com.tiger.creational.builder;
/**
 * 按照一定的顺序进行建造
 * @author yinlihu
 *
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
