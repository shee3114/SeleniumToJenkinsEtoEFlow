package seleniumToJenkinsFlow.seleniumToJenkinsFlow;

import org.testng.annotations.Test;

public class Sheetal1 {

	@Test(priority = 0)
	public void testOne(){
		System.out.println("This is Test One");
	}
	
	@Test(priority = 1)
	public void testTwo(){
		System.out.println("This is Test Two");
	}
}
