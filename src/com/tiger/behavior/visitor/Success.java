package com.tiger.behavior.visitor;

public class Success implements Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println("男人成功的方式");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("女人成功的方式");
	}

}
