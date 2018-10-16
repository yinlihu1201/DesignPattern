package com.tiger.behavior.command;

public abstract class Command {
	protected Barbecuer barbecuer = null;

	public Command(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}
	
	public abstract void excuteCommand();
}
