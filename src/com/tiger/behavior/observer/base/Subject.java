package com.tiger.behavior.observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * @author yinlihu
 *
 */
public abstract class Subject {
	protected List<Observer> observers = new ArrayList<Observer>();
	protected String action; // 主题者的行为
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public abstract void attach(Observer o);
	public abstract void detach(Observer o);
	public abstract void notifyObserve();
}
