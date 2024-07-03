/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Creates a new instance of student and sets address
		Student std1 = new Student("James", (short) 20);
		std1.setAddress("1600 Pennsylvania Avenue NW, Washington, DC 20500");

		//Creates a new instance of Freshman and sets address
		Freshman std2 = new Freshman("Ashely", (short) 20, 12); // name, age, credits
		std2.setAddress("4 Jersey St, Boston, MA 02215");

		//Creates a new instance of Senior and sets address
		Senior std3 = new Senior("John", (short) 30, 90);
		std3.setAddress("2350 NY-110, Farmingdale, NY 11735");

		//Uses scanner to read user input into a temporary string, then uses parseDouble to cast it to a double.
		System.out.println("Please enter James' GPA.");
		String tempGpaStr = scanner.nextLine();
		std1.setGpa(Double.parseDouble(tempGpaStr));

		System.out.println("Please enter Ashely's GPA.");
		tempGpaStr = scanner.nextLine();
		std2.setGpa(Double.parseDouble(tempGpaStr));

		System.out.println("Please enter John's GPA.");
		tempGpaStr = scanner.nextLine();
		std3.setGpa(Double.parseDouble(tempGpaStr));

		//prints objects using toString
		System.out.println(std1);

		System.out.println(std2);

		System.out.println(std3);


		// ToDo 5: Fix the error (DONE)
		// ToDo 6: Fix the constructor of the Student class (DONE)
		// Todo 7: Create two classes for Freshman and Senior (DONE)
		// ToDo 8: The senior class should have a minimum of 85 credits (DONE)
		// ToDo 9: Add a toString method for the Student class (DONE)
		// ToDo 10: Add a toString method for the Freshman class (DONE)
		// ToDo 11: Add a toString method for the Senior class (DONE)
		// ToDo 12: Set the gpa of the student using the scanner and user
		// 		input and then print the output. (DONE)
		// ToDo 13: add comments and explain your code (DONE)

	}

}

