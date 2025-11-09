package fetchData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetDataFromReadyMadeJson {
	
	JsonPath jp = new JsonPath(BodyDefinition.getBody());
	
	@Test(priority=1)
	public void getData() {
		
	
	
	
	String value = jp.getString("dashboard.website");
	System.out.println(value);
	
	
       int corsenamesize = jp.get("courses.size()");  // Print No of courses returned by API
       System.out.println(corsenamesize);
       for(int i=0; i<corsenamesize; i++)           // Print title of courses returned by API
    	   {
    	 String title = jp.get("courses["+i+"].title");
    	 System.out.println(title);
    	   
       }
       
       int purchaseAmount = jp.getInt("dashboard.purchaseAmount");  //  Print Purchase Amount
       System.out.println("Purchase Amount: " +purchaseAmount);
       
       
      String firstTitle=jp.get("courses[0].title");   //Print Title of the first course
      System.out.println("First Title: "+firstTitle);
      
      
      int coursesize=jp.get("courses.size()");    // Num of copies sold by RPA Course
      for(int i=0;i<coursesize;i++) {
    	 String titles= jp.getString("courses["+i+"].title");
    	 if(titles.equals("RPA")) {
    		int copies = jp.getInt("courses["+i+"].copies");
    		System.out.println("Num of copies sold by RPA Course: "+copies);
    	 }
      }
  }
	
	//4. Print All course titles and their respective Prices
	 
	@Test(priority=2)
    public void GetPriceAndValue() {
		
    int coursecount = jp.getInt("courses.size()");
		
		
		for(int i=0; i<coursecount; i++)
		{
			String title = jp.getString("courses["+i+"].title");
			int price = jp.getInt("courses["+i+"].price");
			
			System.out.println(title + " : " + price);
			
			
		}

		System.out.println("--------------");
		
	}
	
	@Test(priority=3)
	public void ValidateCoursePrice() {
		
		int coursecount = jp.getInt("courses.size()");
		int sum=0;
		for(int i=0; i<coursecount;i++) 
		{
		  int copies=jp.getInt("courses["+i+"].copies");
		  int price=jp.getInt("courses["+i+"].price");
		
		  sum =sum+copies*price;
		
		}
		System.out.println("Sum value is : "+sum);
		
        
		
		
		int purchaseamount = jp.getInt("dashboard.purchaseAmount");

		System.out.println("Purchase amount value is : "+purchaseamount);
		
		Assert.assertEquals(sum, purchaseamount);
		
	}

	}
	

 


