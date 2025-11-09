package tryCatch;

public class tryCatchPrintStackTraceMethod {
	
	

	 public static void main(String[] args) {
	        try {
	            int[] arr = new int[4];
	            arr[4] = 3; 
	            System.out.println(arr[1]);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


