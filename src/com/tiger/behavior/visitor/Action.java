package com.tiger.behavior.visitor;
/**
 * 人类的状态
 * @author yinlihu
 *
 */
public interface Action {
	void getManConclusion(Man man);
	void getWomanConclusion(Woman woman);
}
