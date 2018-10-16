package com.tiger.behavior.command;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.bakeChickenWing();
	}
	
}
