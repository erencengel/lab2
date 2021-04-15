package lab2;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// done by erencengel
		
		//write a program that asks user for the number of males and females registered in a class. The program should display
		//the percentage of males and females in the class
		
		Scanner sc = new Scanner (System.in);
			
			System.out.println("number of males= ");
			int males = sc.nextInt();
		
			System.out.println("number of females");
			int females = sc.nextInt();
			
			int percentageofmales;
			int percentageoffemales;
			
			percentageofmales = males*100/(males+females);
			percentageoffemales= 100-percentageofmales;
			
			System.out.println("percentageofmales= " + "%" + percentageofmales);
			System.out.println("percentageoffemales= " + "%" + percentageoffemales);
	
	
	}

}
