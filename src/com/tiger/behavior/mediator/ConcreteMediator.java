package com.tiger.behavior.mediator;

public class ConcreteMediator extends Mediator {
	
	private ConcreteColleague1 cc1;
	private ConcreteColleague2 cc2;
	
	public ConcreteColleague1 getCc1() {
		return cc1;
	}

	public void setCc1(ConcreteColleague1 cc1) {
		this.cc1 = cc1;
	}

	public ConcreteColleague2 getCc2() {
		return cc2;
	}

	public void setCc2(ConcreteColleague2 cc2) {
		this.cc2 = cc2;
	}

	@Override
	public void send(String message, Colleague colleague) {
		// 逻辑是1给2发，2给1发
		if(colleague == cc1){
			cc2.notify(message);
		}else{
			cc1.notify(message);
		}
	}

}
