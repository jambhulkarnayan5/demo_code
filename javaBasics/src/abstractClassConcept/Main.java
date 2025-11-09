package abstractClassConcept;

public class Main {

		// Main driver method
		public static void main(String[] args)
		{

			// Creating Bus object
			Bus b = new Bus();

			// Creating Auto object
			Auto a = new Auto();

			// Now getting and displaying
			// the number of wheels
			// for Bus by calling the
			// getNumberOfWheel method
			System.out.println("Number of wheels in bus is"
							+ " " + b.getNumberOfWheel());

			// Now getting and displaying
			// the number of wheels
			// for Auto by calling the
			// getNumberOfWheel method
			System.out.println("Number of wheels in Auto is"
							+ " " + a.getNumberOfWheel());
		}

}
