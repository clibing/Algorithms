package org.Algorithms.TemplateMethodModule;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * @author Administrator
 * 提神饮料
 */
public abstract class RefreshBeverage {
	/**
	 * 定义为final 不允许子类复写
	 * 制作饮料的模板方法
	 * 封装了所有子类共同遵循的算法框架
	 */
	public final void refreshBeverageTemplate(){
		/**
		 * first: 将水煮沸
		 */
		boilWater();
		
		/**
		 * two: 泡制饮料
		 */
		brew();
		
		/**
		 * three: 将饮料倒入杯中
		 */
		pourInCup();
		
		/**
		 * 加入调味料
		 */
		if(isAllowAddCondiment()){
			addCondiments();
		}
		
	}

	/**
	 * Hook,钩子函数，提供一个默认（有返回值）或空（void方法，方法体不写）的实现
	 * 具体的子类可以自行决定是否钩挂以及如何挂钩
	 * 是否允许加入调味剂,默认允许
	 * @return
	 */
	protected boolean isAllowAddCondiment() {
		return true;
	}

	/**
	 * 基本方法，将水煮沸，这个方法是公共方法，都需要将水煮沸，直接定义为私有方法即可
	 */
	private void boilWater() {
		System.out.println("将水煮沸");
	}
	
	/**
	 * 基本方法，将水倒入杯中，这个方法是公共方法，都是将水倒入杯中，直接定义为私有方法即可
	 */
	private void pourInCup() {
		System.out.println("将水倒入杯子中");
		
	}
	
	/**
	 * 需要子类具体实现方法,泡制饮料
	 */
	protected abstract void brew();
	
	/**
	 * 具体加入什么调料，需要子类实现。 加入调味料
	 */
	protected abstract void addCondiments();
}
















