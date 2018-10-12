package com.tiger.creational.prototype.deepcopy;


public class Prototype implements Cloneable {

	private String id ;
	
	private String name;
	
	private Work work;

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public Prototype() {
		super();
	}

	public Prototype(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		Prototype p = (Prototype)super.clone();
		p.setWork(work.clone());
		return p;
	}
	
	
}
