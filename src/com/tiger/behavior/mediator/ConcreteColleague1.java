package com.tiger.behavior.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message){
		mediator.send(message, this);
	}
	
	/**
	 * 由中介者发送消息
	 * @param message
	 */
	public void notify(String message){
		System.out.println("同事1收到消息：" + message);
	}

}
