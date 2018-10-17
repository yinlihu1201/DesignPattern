package com.tiger.behavior.observer.base;

public class Secretary extends Subject {

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserve() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
