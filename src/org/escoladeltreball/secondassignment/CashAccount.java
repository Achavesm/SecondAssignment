/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw39397876
 *
 */
public class CashAccount extends BankImpl {

	/**
	 * @param owner as de owner of the Account
	 * @param balance as the initial balance of the Account
	 */
	public CashAccount(String owner, double balance) {
		super(owner, balance);
	}

	@Override
	public void withdraw(double euros) throws Exception {
		if (super.getBalance() - euros > 0) {
			super.balance = super.balance - euros;
		}
	}
}
