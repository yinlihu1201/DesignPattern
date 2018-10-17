package com.tiger.behavior.observer.reflect;

public class Secretary extends Subject {
	@Override
	public void attach(Event e) {
		observers.add(e);
	}

	@Override
	public void detach(Event e) {
		observers.remove(e);
	}

	@Override
	public void notifyObserve() {
		try {
			for (Event event : observers) {
				event.invoke();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
