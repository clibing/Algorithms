package org.Algorithms.TemplateMethodModule;

/**
 * 具体子类，提供了制作茶的具体实现
 * @author Administrator
 *
 */
public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用80度的热水，浸泡茶叶5分钟");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬！");
	}

	/**
	 * 子类通过覆盖的形式选择
	 */
	@Override
	protected boolean isAllowAddCondiment() {
		return false;
	}
	
}
