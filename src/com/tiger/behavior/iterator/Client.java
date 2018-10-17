package com.tiger.behavior.iterator;

/**
 * 
 * 迭代器模式：提供一个方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * 
 * 应用场景：当你需要访问一个聚焦对象，而且不管这些对象是什么，都需要遍历的时候，使用此模式，参考java的Iterator接口
 * 
 * Aggregate其实就是类似于List的集合，不过List的ConcreteIterator是以内部类的形式实现的
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.setItem("小明1");
		aggregate.setItem("小明2");
		aggregate.setItem("小明3");
		aggregate.setItem("小明4");
		aggregate.setItem("小明5");
		Iterator iterator = aggregate.createIterator();
		/*Object currentItem = iterator.currentItem();
		Object next = iterator.next();
		System.out.println(currentItem);
		System.out.println(next);
		System.out.println(iterator.currentItem());*/
		while(!iterator.isDone()){
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}
}
