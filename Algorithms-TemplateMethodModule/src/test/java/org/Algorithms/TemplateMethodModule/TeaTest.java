package org.Algorithms.TemplateMethodModule;

import org.junit.Test;

public class TeaTest {

	@Test
	public void teaTest(){
		System.out.println("制作茶...");
		RefreshBeverage rb = new Tea();
		rb.refreshBeverageTemplate();
		
		System.out.println("茶好了！");
	}
}
