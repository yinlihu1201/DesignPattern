package com.tiger.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * @author yinlihu
 *
 */
public class ObjectStructure {
	private List<Person> list = new ArrayList<Person>();
	
	public void attach(Person element){
		list.add(element);
	}
	
	public void detach(Person element){
		list.remove(element);
	}
	
	// 查看显示
	public void display(Action visitor){
		for (Person p : list) {
			p.accept(visitor);
		}
	}
}
