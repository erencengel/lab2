package lab2;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		//done by me and totaly wrong
		//write a program with a loop that lets user enter a series of integer numbers.After all the numbers have been entered, the program
		//should display the largest and smallest numbers entered.
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first number: ");
		int a = sc.nextInt();
		System.out.print("Enter your next number: ");
		int b = sc.nextInt();
		int largest;
		int smallest;
			if (a>b) {
				largest=a;
				smallest=b;
			}else {
				largest=b;
				smallest=a;
			}
		
		do {
			System.out.print("Do you want to enter an other number: 0-No, 1-Yes ");
			int c = sc.nextInt();
				if (c==1) {
					System.out.print("enter your next number: ");
					int d= sc.nextInt();
					if (a>b&&a>d) {
						largest=a;
					}
					if (b>a&&b>d) {
						largest=b;
					}
					if (d>a&&d>b) {
						largest=d;
					}
					if (a<b&&a<d) {
						smallest=a;
					}
					if (b<a&&b<d) {
						smallest=b;
					}
					if (d<a&&d<b) {
						smallest=d;
					}
				}else if (c==0) {
				
				break;
				
				}
			
		} while (true);
		
		
		System.out.println("Smallest number: " + smallest);
		System.out.println("largest number" + largest);
	
	
	
	
	
	
	
	
	
	}
}