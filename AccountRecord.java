//Como programar en Java 9na Ed
//Pag 727
//package com.deitel.ch17;

public class AccountRecord
{
	private int account;
	private String firstName;
	private String lastName;
	private double balance;

	// no-argument constructor calls other constructor with default values	
	public AccountRecord(){
		this( 0, "", "", 0.0 ); // call four-argument constructor
	}
	
	public AccountRecord( int acct, String first, String last, double bal ){
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);	
	}

	public void setAccount(int acct){
		account = acct;
	}

	public int getAccount() {
		return account;
	}

	public void setFirstName(String first){
		firstName = first;
	}

	public String getFirstName(){
		return firstName;
	}

	// set last name
	public void setLastName( String last )
	{
		lastName = last;
	} // end method setLastName

	// get last name
	public String getLastName()
	{
		return lastName;
	} // end method getLastName

	// set balance
	public void setBalance( double bal )
	{
		balance = bal;
	} // end method setBalance
	// get balance
	public double getBalance()
	{
		return balance;
	} // end method getBalance
}
