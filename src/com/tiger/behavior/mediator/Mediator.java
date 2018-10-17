package com.tiger.behavior.mediator;

/**
 * 中介者
 * @author yinlihu
 *
 */
public abstract class Mediator {
	public abstract void send(String message,Colleague colleague);
}
