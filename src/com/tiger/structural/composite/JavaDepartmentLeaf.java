package com.tiger.structural.composite;

/**
 * 叶子节点：java研发部
 * @author yinlihu
 *
 */
public class JavaDepartmentLeaf extends Company {

	public JavaDepartmentLeaf(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		
	}

	@Override
	public void remove(Company c) {
		
	}

	@Override
	public void display(int depth) {
		System.out.println(this.getSplit(depth) + name);
	}

	@Override
	public void lineDuty() {
		System.out.println(name + ":java研发及运维");
	}

}
