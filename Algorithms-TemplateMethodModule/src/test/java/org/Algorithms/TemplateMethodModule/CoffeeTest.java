package org.Algorithms.TemplateMethodModule;

import org.junit.Test;

public class CoffeeTest {
	@Test
	public void coffeeTest(){
		System.out.println("制作咖啡...");
		
		RefreshBeverage rb = new Coffee();
		rb.refreshBeverageTemplate();
		
		System.out.println("咖啡结束，可以饮用!");
	}
}
