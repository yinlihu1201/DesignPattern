package com.tiger.creational.prototype.deepcopy;

public class Work implements Cloneable {
	private String id;
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	protected Work clone() throws CloneNotSupportedException {
		return (Work)super.clone();
	}
	
}
