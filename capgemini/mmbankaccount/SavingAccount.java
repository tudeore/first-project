package com.capgemini.mmbankaccount;

public abstract class SavingAccount extends BankAccount 
{
	private boolean isSalary;
	static final float minBalance = 20000;
	
	public SavingAccount(String accountHolderName, double accounBalance)
	{
		super(accountHolderName, accounBalance);
		this.isSalary = isSalary;
	}

	@Override
	public void withDraw(float withdraw) 
	{
		// TODO Auto-generated method stub
		
	}
	

}
