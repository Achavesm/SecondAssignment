package org.escoladeltreball.secondassignment;

public class CreditAccount extends BankImpl {

	public CreditAccount(String owner, double balance) {
		super(owner, balance);
	}

	@Override
		public void withdraw(double euros) throws Exception {
			if (super.getBalance() - euros > MIN_BALANCE) {
				super.balance = super.balance - euros;
			}
		}
	}