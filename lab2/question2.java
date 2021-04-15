package lab2;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		//done by erencengel
		
		//a bag of cookies holds 40 cookies.The calorie information on the bag claims that there are 10 serving in the bag and that a serving
		// equals 300 calories.Write a program that lets the user enter the number of cookies he or she actually ate and reports the number
		//of total calories consumed
		
		Scanner sc = new Scanner(System.in);
		int calorie=75;
			System.out.println("number of cookies: ");
			int cookie = sc.nextInt();
			int totalConsumesCalories= cookie*calorie;
			System.out.println("totalConsumesCalories= " + totalConsumesCalories);

	}

}
