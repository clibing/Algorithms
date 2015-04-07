package org.Algorithms.TemplateMethodModule;

/**
 * 具体子类，提供咖啡制作的具体实现，继承了抽象基类，需要实现所有的抽象方法
 * @author Administrator
 *
 */
public class Coffee extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡！");

	}

	@Override
	protected void addCondiments() {
		System.out.println("加入糖和奶块！");

	}

	/**
	 * 子类实现，父类就是允许加入调味剂，此方法可以不同复写
	 
	@Override
	protected boolean isAllowAddCondiment() {
		return true;
	}
	 */
}
