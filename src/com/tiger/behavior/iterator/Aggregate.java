package com.tiger.behavior.iterator;

/**
 * 聚集抽象接口
 * 其实就是类似于List的集合
 * @author yinlihu
 *
 */
public interface Aggregate {
	Iterator createIterator();
}
