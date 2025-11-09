package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Dataprovider separates data with scripts.
//This is particularly useful when you need to run a test method multiple times with different sets of data.
public class DataproviderConcept {
	
	@Test(dataProvider="dataSupplier")
	public void sampleLoginTest(String username, String password){
		
		System.out.println("Logged in using: "+username+" and "+password);
		
		
	}
	
	@DataProvider(name="dataSupplier")
	public Object [][] supplyDataMethod(){ // returns 2 dimensional list of object
		
		Object [][] data = new Object [3][2];
		data[0][0]= "naya";
		data[0][1]= "123";
		
		data[1][0]= "abc";
		data[1][1]= "456";
		
		data[2][0]= "xyz";
		data[2][1]= "890";
		
		return  data;
	}
	
//{{"naya","123"},{"abc","456"},{"xyz","890"}}
}
