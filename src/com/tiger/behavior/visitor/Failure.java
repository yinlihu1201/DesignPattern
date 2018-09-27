package com.tiger.behavior.visitor;

public class Failure implements Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println("man failure");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("woman failure");
	}

}
