package com.tiger.behavior.memento;

/**
 * 
 * 备忘录模式： 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之处保存这个状态。这样可以将该对象恢复到原先保存的状态。
 * 
 * 应用场景：游戏存进度,适用于功能比较复杂，但需要维护或记录属性历史的类，或者需要保存属性只是众多属性中的一小部分时，Originator可以根据保存的Memento信息还原到前一状态
 * 
 * 
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		GameRoleOriginator originator = new GameRoleOriginator();
		originator.getInitState();
		originator.stateDisplay();
		
		RoleStateCaretaker c = new RoleStateCaretaker();
		c.setMemento(originator.saveState());
		
		originator.fight();
		originator.stateDisplay();
		
		originator.recoveryState(c.getMemento());
		originator.stateDisplay();
	}
}
