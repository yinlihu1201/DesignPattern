package com.tiger.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 有枝节点:有下属子节点
 * 具体的公司
 * @author yinlihu
 *
 */
public class ConcreteCompany extends Company {
	
	private List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		super(name);
	}
	
	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(this.getSplit(depth) + name);
		for (Company child : children) {
			child.display(depth + 2);
		}
	}
	
	@Override
	public void lineDuty() {
		for (Company company : children) {
			company.lineDuty();
		}
	}
	
}
