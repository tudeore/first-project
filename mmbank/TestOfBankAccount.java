package com.capgemini.mmbank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.mmbankaccount.BankAccount;
import com.capgemini.mmbankaccount.BankFactory;
import com.capgemini.mmbankaccount.CurrentAccount;
import com.capgemini.mmbankaccount.MMBankFactory;
import com.capgemini.mmbankaccount.MMCurrentAccount;
import com.capgemini.mmbankaccount.MMSavingAccount;
import com.capgemini.mmbankaccount.SavingAccount;

public class TestOfBankAccount
{
	
	@Test
	public void test() 
	{
		SavingAccount savingAccountOne = new MMSavingAccount("tushar", 15000);
		System.out.println(savingAccountOne.deposit(10000));
	
	}
	
	@Test
	public void testof() 
	{
		
	}


}
