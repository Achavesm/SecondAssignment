/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw39397876
 *
 */
public abstract class BankImpl implements Bank {

	protected String owner;
	protected double balance;

	public BankImpl(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	@Override
	public abstract void withdraw(double euros) throws Exception;


	@Override
	public void deposit(double euros) {
		this.balance = this.balance + euros;
	}

	@Override
	public double toDollars() {
		return getBalance() * DOLAR_RATE;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public boolean isBalanceNegative() {
		if (getBalance() < 0.0) {
			return true;
		} else {
			return false;
		}
	}
}
