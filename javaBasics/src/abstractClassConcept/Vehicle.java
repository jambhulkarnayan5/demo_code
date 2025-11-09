package abstractClassConcept;
//Java program to illustrate Abstract Access Modifier

		// Importing the required packages
		import java.io.*;
		import java.util.*;




	//  public void  main(String... args) {
		
		// Class 1
		// Helper abstract class
		abstract class Vehicle {

			// Declaring an abstract method getNumberOfWheel
			abstract public int getNumberOfWheel();
		}

		// Class 2
		// Helper class extending above abstract class
		class Bus extends Vehicle {

			// Giving the implementation
			// to the parent abstract method
			public int getNumberOfWheel() { return 7; }
		}

		// Class 3
		// Helper class extending above abstract class
		class Auto extends Vehicle {

			// Giving the implementation
			// to the parent abstract method
			public int getNumberOfWheel() { return 3; }
		}

		// Class 4
		// Main class
		
		

	


