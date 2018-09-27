package com.tiger.structural.adapter;

public class Client {
	public static void main(String[] args) {
		USABasketballPlayer huo = new USACenter("霍华德");
		USABasketballPlayer yao = new TranslatorAdaptor("姚明");
		
		huo.attack();
		huo.defense();
		
		yao.attack();
		yao.defense();
	}
}
