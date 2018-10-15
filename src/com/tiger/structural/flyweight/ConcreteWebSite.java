package com.tiger.structural.flyweight;

/**
 * 可进行共享的实例
 * @author yinlihu
 *
 */
public class ConcreteWebSite extends WebSite {
	
	private String name;

	public ConcreteWebSite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void use(User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}

}
