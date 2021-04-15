package lab2;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		//done by erencengel
		
		// write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all
		// the integers from 1 up to number entered.
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("please put a positive nonzero number: ");
		int num = sc.nextInt();
			for(int i=0; i<=num; i++) {
				sum=sum + i;
			}
		System.out.println(sum);

	}

}
