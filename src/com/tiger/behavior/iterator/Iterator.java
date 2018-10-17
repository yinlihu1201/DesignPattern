package com.tiger.behavior.iterator;

public interface Iterator {
	Object first();
	
	Object next();
	
	boolean isDone();
	
	Object currentItem();
}
