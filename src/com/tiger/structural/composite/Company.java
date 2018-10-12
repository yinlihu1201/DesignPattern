package com.tiger.structural.composite;

public abstract class Company {
	protected String name;

	public Company(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public abstract void display(int depth); // 显示
	public abstract void lineDuty(); // 职责
	
	protected String getSplit(int depth){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		return sb.toString();
	}

}
