/**
 * 
 */
package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw39397876
 *
 */
public class BankImplTest {

	private static BankImpl main;
	private static BankImpl test;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		main = new CashAccount("Aleix", 500.0);
		test = new CreditAccount("Aleix", -150.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		main = null;
		test = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#withdraw(double)}.
	 * @throws Exception 
	 */
	@Test
	public final void testWithdraw() throws Exception {
		main.withdraw(300.0);
		assertEquals(200.0, main.getBalance(), 1e-4);
		test.withdraw(50.0);
		assertEquals(-200.0, test.getBalance(), 1e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#deposit(double)}.
	 */
	@Test
	public final void testDeposit() {
		main.deposit(200.0);
		assertEquals(700.0, main.getBalance(), 1e-4);
		test.deposit(150.0);
		assertEquals(0.0, test.getBalance(), 1e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#toDollars()}.
	 */
	@Test
	public final void testToDollars() {
		assertEquals(700.0, main.toDollars(), 1e-4);
		assertEquals(-210.0, test.toDollars(), 1e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#getBalance()}.
	 */
	@Test
	public final void testGetBalance() {
		assertEquals(500.0, main.getBalance(), 1e-4);
		assertEquals(-150.0, test.getBalance(), 1e-4);

	}

	/**
	 * Test method for {@link org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()}.
	 */
	@Test
	public final void testIsBalanceNegative() {
		assertEquals(false, main.isBalanceNegative());
		assertEquals(true, test.isBalanceNegative());

	}

}
