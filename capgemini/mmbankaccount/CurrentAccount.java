package com.capgemini.mmbankaccount;

public abstract class CurrentAccount extends BankAccount
{
	final float creditLimit;

	public CurrentAccount(String accountHolderName, double accounBalance,float creditLimit) 
	{
		super(accountHolderName, accounBalance);
		this.creditLimit = creditLimit;
		
	}
//---------------------withdraw function---------------------------------------------------------------------------------

	@Override
	public void withDraw(float withdraw)
	{
		// TODO Auto-generated method stub
		
	}
	
	

}
