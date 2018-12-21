package com.capgemini.mmbankaccount;

public abstract class SavingAccount extends BankAccount 
{
	private boolean isSalary;
	static final float minBalance = 2000;
	
	public SavingAccount(String accountHolderName, double accounBalance) //constructor.
	{
		super(accountHolderName, accounBalance);
		this.isSalary = isSalary;
	}

	@Override
	public abstract void withDraw(double withdraw);			// function.
	

}
