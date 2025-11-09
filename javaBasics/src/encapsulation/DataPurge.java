package encapsulation;

public class DataPurge {
	
	private int i= 50;
	
	public void getData(int pin) {
		
		if(pin ==1234) 
		{
		System.out.println(i);
		}
		else {
			System.out.println("please check the data");
		}
	}
	
	
}

