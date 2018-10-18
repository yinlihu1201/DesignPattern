package com.tiger.behavior.memento;
/**
 * 游戏角色类
 * @author yinlihu
 *
 */
public class GameRoleOriginator {
	private int vitality;
	private int attack;
	private int defense;
	
	public void stateDisplay(){
		System.out.println("当前角色状态：");
		System.out.println("体力：" + vitality);
		System.out.println("攻击力：" + attack);
		System.out.println("防御力：" + defense);
		System.out.println("");
	}
	
	/**
	 * 保存进度
	 * @return
	 */
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vitality, attack, defense);
	}
	/**
	 * 读档
	 * @param memento
	 */
	public void recoveryState(RoleStateMemento memento){
		this.vitality = memento.getVitality();
		this.attack = memento.getAttack();
		this.defense = memento.getDefense();
	}
	/**
	 * 初始化状态
	 */
	public void getInitState(){
		this.vitality = 100;
		this.attack = 100;
		this.defense = 100;
	}
	/**
	 * 打完boos后的
	 */
	public void fight(){
		this.vitality = 0;
		this.attack = 0;
		this.defense = 0;
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
