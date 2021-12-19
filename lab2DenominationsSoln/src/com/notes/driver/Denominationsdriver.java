package com.notes.driver;

import java.util.Scanner;

import com.notes.denominations.*;

public class Denominationsdriver {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		
		int numDenoms = scan.nextInt();
		Denominations denominations = new Denominations(numDenoms);
		
		System.out.println("Enter the currency denominations value");
		
		for(int i = 0; i < numDenoms;i++)
		{
			denominations.setDenominations(i,scan.nextInt());
		}
		
		
		System.out.println("Enter the amount you want to pay");
		
		denominations.setAmountToPay(scan.nextInt());
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		denominations.paymentDenominations();
			
     }

}
