package com.tiger.behavior.memento;

/**
 * 角色状态存储箱
 * @author yinlihu
 *
 */
public class RoleStateMemento {
	private int vitality;
	private int attack;
	private int defense;
	public RoleStateMemento(int vitality, int attack, int defense) {
		super();
		this.vitality = vitality;
		this.attack = attack;
		this.defense = defense;
	}
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
}