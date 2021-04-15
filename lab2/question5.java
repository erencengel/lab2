package lab2;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// done by erencengel
		
		//write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the charge for the meal.
		//The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total after adding tax. Display the meal charge,
		//tax amount, tip amount and total bill on the screen.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the customer bill= ");
			double bill = sc.nextInt();
			double tax = bill*6.75/100;
			double tip = (bill+tax)*20/100;
			double totalmealcharge = bill + tax + tip;
			
			System.out.println("bill= " + bill);
			System.out.println("tax= " + tax);
			System.out.println("tip= " + tip);
			System.out.println("totalmealcharge= " + totalmealcharge);
			
			

	}

}
