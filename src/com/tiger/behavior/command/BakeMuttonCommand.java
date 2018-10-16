package com.tiger.behavior.command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.bakeMutton();
	}
}
