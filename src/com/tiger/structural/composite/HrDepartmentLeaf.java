package com.tiger.structural.composite;
/**
 * 叶子节点：人力资源
 * @author yinlihu
 *
 */
public class HrDepartmentLeaf extends Company {

	public HrDepartmentLeaf(String name) {
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
		System.out.println(name + ":员工招聘管理培训");
	}

}
