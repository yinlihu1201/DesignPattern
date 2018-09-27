package com.tiger.structural.adapter;

public abstract class USABasketballPlayer {
	protected String name;
	public USABasketballPlayer(String name) {
		this.name = name;
	}
	
	public abstract void attack();
	public abstract void defense();
}
