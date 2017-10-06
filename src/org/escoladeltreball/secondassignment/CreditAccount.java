package org.escoladeltreball.secondassignment;

public class CreditAccount extends BankImpl {

	/**
	 * 
	 * @param owner as the owner of the Account
	 * @param balance as the initial balance of the Account
	 */
	public CreditAccount(String owner, double balance) {
		super(owner, balance);
	}

	@Override
	public void withdraw(double euros) throws Exception {
		//if the balance after withdrawing would be less than the minimum possible balance, it won't do it
		if (super.getBalance() - euros > MIN_BALANCE) {
			super.balance = super.balance - euros;
		} else {
			throw new Exception("Insufcient balance Exception");
		}
	}
}