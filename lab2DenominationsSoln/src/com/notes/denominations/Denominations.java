package com.notes.denominations;
import java.util.Arrays;
import java.util.Collections;

public class Denominations {

	private int numDenominations;
	private Integer denomationValues[];
	private int amountToPay;
	private Integer denominationCntr[];
	
	public int getAmountToPay() {
		return amountToPay;
	}

	public void setAmountToPay(int amountToPay) {
		this.amountToPay = amountToPay;
	}

	public Denominations(int numDenominations)
	{
		denomationValues = new Integer[numDenominations]; 
		denominationCntr = new Integer[numDenominations];
		Arrays.fill(denominationCntr, 0);
		amountToPay = 0;
		this.numDenominations = numDenominations;
	}
	
	public void setDenominations(int index, int value)
	{
		denomationValues[index] = value;
	}
	
	// Compute minimum payment denominations
	public void paymentDenominations()
	{
		Arrays.sort(denomationValues,Collections.reverseOrder());
		
		for (int i = 0; i < numDenominations; i++) {
	        if (amountToPay >= denomationValues[i]) {
	        	denominationCntr[i] = amountToPay / denomationValues[i];
	        	amountToPay = amountToPay - denominationCntr[i] * denomationValues[i];
	        }
	    }
	     
	    // Print denominations
	    for (int i = 0; i < numDenominations; i++) {
	        if (denominationCntr[i] != 0) {
	        	System.out.println(denomationValues[i]+":"+denominationCntr[i]);
	        }
	    }
	}
	
}
