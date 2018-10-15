package com.tiger.structural.flyweight;

/**
 * 
 * 不共享的实例
 * 
 * @author yinlihu
 *
 */
public class UnshareConcreteWebSite extends WebSite {
	
	private String name;
	
	public UnshareConcreteWebSite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void use(User user) {
		System.out.println("不共享的网站分类：" + name + " 用户：" + user.getName());
	}

}
