package test2;

import org.testng.annotations.Test;

public class GroupingConcept {
	
	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("Test1 Method executed");
	}
	
	@Test(groups = {"functional","sanity"})
	public void Test2() {
		System.out.println("Test2 Method executed");
	}
	
	@Test(groups= {"smoke"})
	public void Test3() {
		System.out.println("Test3 Method executed");
	}
	
	
}
