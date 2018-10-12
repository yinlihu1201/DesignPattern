package com.tiger.structural.composite;

/**
 * 叶子节点：财务部
 * @author yinlihu
 *
 */
public class FinanceDepartmentLeaf extends Company {

	public FinanceDepartmentLeaf(String name) {
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
		System.out.println(name + ":公司财务收支管理");
	}

}
