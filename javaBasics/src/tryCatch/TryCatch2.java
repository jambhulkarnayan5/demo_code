package tryCatch;

public class TryCatch2 {

	public static void main(String[] args) {
		try {
			int result = 10 /0;
		} catch (Exception e) {
			System.out.println(e);

		}

		finally {
			System.out.println("test");
		}
	}

}
