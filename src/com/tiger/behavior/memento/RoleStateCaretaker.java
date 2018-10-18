package com.tiger.behavior.memento;

/**
 * 角色状态管理者
 * @author yinlihu
 *
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
}
