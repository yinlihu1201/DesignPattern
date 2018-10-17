package com.tiger.behavior.iterator;

public class ConcreteIterator implements Iterator{
	
	private ConcreteAggregate aggregate;
	private int cursor = 0; // 游标
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItem(0);
	}

	@Override
	public Object next() {
		Object tmp = null;
		cursor++;
		if(cursor < aggregate.count()){
			tmp = aggregate.getItem(cursor);
		}
		return tmp;
	}

	@Override
	public boolean isDone() {
		return cursor < aggregate.count() ? false : true;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItem(cursor);
	}

}
