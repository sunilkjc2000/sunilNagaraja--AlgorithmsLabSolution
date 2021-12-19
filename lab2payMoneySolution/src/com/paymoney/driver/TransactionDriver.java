package com.paymoney.driver;

import java.util.Scanner;
import com.paymoney.transaction.*;

// Driver class
public class TransactionDriver {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		
		int numTranscs = scan.nextInt();
		Transactions transactions = new Transactions(numTranscs);
		
		System.out.println("Enter the values of array");
		
		for(int i = 0; i < numTranscs;i++)
		{
			transactions.setTransactions(i,scan.nextFloat());
		}
		
		transactions.computeTransactionSum();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int numTargets = scan.nextInt();
		
		for(int i = 0; i < numTargets; i++)
		{
			System.out.println("Enter value of target");
			
			float target = scan.nextFloat();
			if(transactions.isTargetReached(target))
			{
		        System.out.println("Target achieved after " + transactions.numTransToReachTarget(target) + " transactions");		
			}
			else
			{
				System.out.println("Given target is not achieved");
			}
		}
		
		return;
	}

}
