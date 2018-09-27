package com.tiger.structural.adapter;

/**
 * 中国中锋不懂英语，去国外打球需要翻译，翻译就是适配器
 * @author yinlihu
 *
 */
public class ChineseCenter {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("中国中锋" + name + "进攻");
	}

	public void defense() {
		System.out.println("中国中锋" + name + "防守");
	}
}
