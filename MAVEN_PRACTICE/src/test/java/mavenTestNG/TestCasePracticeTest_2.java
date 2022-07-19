package mavenTestNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class TestCasePracticeTest_2 {
	
	@Test(dependsOnMethods = "mavenTest5" )
	public void mavenTest4() {
		System.out.println("maven Test 4");
	}
	@Test
	public void mavenTest5() {
		System.out.println("maven Test 5");
		
	}
	@Test
	public void mavenTest6() {
		System.out.println("maven Test 6");
	}
	@Test
	public void mavenTest7() {
		System.out.println("maven Test 7");
	}

}
