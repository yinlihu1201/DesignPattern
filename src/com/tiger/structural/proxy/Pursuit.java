package com.tiger.structural.proxy;

public class Pursuit implements GiveGift {
	
	private SchoolGirl sg = null; // 被代理对象知道要处理的对象
	
	public Pursuit(SchoolGirl sg) {
		this.sg = sg;
	}

	@Override
	public void giveDolls() {
		System.out.println("送洋娃娃给" + sg.getName());
	}

	@Override
	public void giveFlowers() {
		System.out.println("送花为" + sg.getName());
	}

}
