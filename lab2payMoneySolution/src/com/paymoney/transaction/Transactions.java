package com.paymoney.transaction;

public class Transactions {
	private float transactions[];
	private int numTransactions;
	private float sumOfTransactions;
	
	public Transactions(int numTransactions)
	{
        this.numTransactions  = numTransactions;
        transactions = new float[numTransactions];
        sumOfTransactions = 0;
	}

	public void setTransactions(int index, float value)
	{
		transactions[index] = value;
	}
	// Perform a quick target reach check
	public boolean isTargetReached(float target)
	{
	    if(sumOfTransactions > target)
	    {
	    	return true;
	    }
	    
	    return false;
	}
	
	// Keep total transactions which could be used for quick target check
	public void computeTransactionSum()
	{
		for(int i = 0; i < numTransactions;i++)
		{
			sumOfTransactions =  sumOfTransactions + transactions[i];
		}
	}
	
	// Routine to get info on number of transactions 
	// after which target is reached
    public int numTransToReachTarget(float targetAmnt)
    {
   
        float sum = 0;
    	for(int i = 0; i < numTransactions;i++)
		{
           sum = sum + 	transactions[i];
           if(sum > targetAmnt)
           {
        	    return (i+1);   
           }
		}
    	return 0;
    }	

}
