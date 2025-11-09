package test2;

import org.testng.annotations.Test;

public class GroupingConcept2 {
	@Test(groups= {"sanity","functional"})
	public void Test4() {
		System.out.println("Test4 Method executed");
	}
	@Test(groups= {"smoke"})
	public void Test5() {
		System.out.println("Test5 Method executed");
	}
	@Test(groups= {"smoke", "functional"})
	public void Test6() {
		System.out.println("Test6 Method executed");
	}
	
	@Test(groups= {"sanity", "functional"})
	public void Test7() {
		System.out.println("Test7 Method executed");
	}


}
