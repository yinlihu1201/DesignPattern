package com.tiger.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private List<String> list = new ArrayList<String>();
	
	public void add(String part){
		list.add(part);
	}
	
	public void show(){
		System.out.println("展示产品:");
		for (String s : list) {
			System.out.println("  " + s);
		}
	}
}
