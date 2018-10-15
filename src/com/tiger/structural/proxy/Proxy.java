package com.tiger.structural.proxy;

public class Proxy implements GiveGift{
	private Pursuit ps = null; // 被代理对象知道要处理的对象
	
	public Proxy(SchoolGirl sg) {
		this.ps = new Pursuit(sg);
	}
	@Override
	public void giveDolls() {
		System.out.println("代理前");
		ps.giveDolls();
		System.out.println("代理后");
	}

	@Override
	public void giveFlowers() {
		ps.giveFlowers();
	}

}
