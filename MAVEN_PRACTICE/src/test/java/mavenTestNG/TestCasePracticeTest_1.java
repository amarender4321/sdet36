package mavenTestNG;

import org.testng.annotations.Test;

public class TestCasePracticeTest_1 {
	@Test(priority = 3)
	public void test1() {
		System.out.println("Test Case 1");
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("Test Case 2");
	}
	@Test(priority = 2)
	public void test3() {
		System.out.println("Test Case 3");
	}
	@Test
	public void test4() {
		System.out.println("Test Case--- 4");
	}
}
