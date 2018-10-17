package com.tiger.behavior.observer.reflect;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * @author yinlihu
 *
 */
public abstract class Subject {
	protected List<Event> observers = new ArrayList<Event>();
	protected String action; // 主题者的行为
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public abstract void attach(Event e);
	public abstract void detach(Event e);
	public abstract void notifyObserve();
}
