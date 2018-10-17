package com.tiger.behavior.iterator;

import java.util.ArrayList;
import java.util.List;


public class ConcreteAggregate implements Aggregate {
	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}
	
	public Object getItem(int index){
		return items.get(index);
	}
	
	public void setItem(Object value){
		items.add(value);
	}

}
