package lab2;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		// done by erencengel
		
		//write a program that will ask the user to enter the amount of a purchase. The program should then compute the state and county tax sales
		//tax. Assume the state sales tax is 4 percent and the county sales tax is 2 percent. The program should display the amount of the purchase
		//the state sales tax, the county sales tax, the total sales tax and the total of the sale(which is the sum of the amount of purchase
		//plus the total sales tax
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter amount of a purchase: ");
		int purchase = sc.nextInt();
		int statetax = purchase*4/100;
		int countytax = purchase*2/100;
		int totaltax = statetax + countytax;
		int totalofpurchase = purchase + totaltax;
		
		System.out.println("purchase= " + purchase);
		System.out.println("statetax= " + statetax);
		System.out.println("countytax= " + countytax);
		System.out.println("totaltax= " + totaltax);
		System.out.println("totalofpurchase= " + totalofpurchase);

	}

}
