package com.capgemini.mmbankaccount;

public abstract class BankAccount 
{
	static double accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	static
	{
		accountNumber = 100;
	}
	{
		accountNumber++;
	}
	public BankAccount(String accountHolderName,double accounBalance) 
	{
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		
	}
	
	public double getAccountNumber() 
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getAccounBalance()
	{
		return accountBalance;
	}
	
//-----------withdraw function-----------------------------------------------------------------------------------//
	
	public abstract void withDraw(float withdraw);
//---------------deposite function-----------------------------------------------------------------------------------//
	
	public void deposite()
	{
		
	}
	
}
