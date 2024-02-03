/**
 * This class tests the instances and methods of the BankAccount class
 * @author Nathan Ghedoni
 * @version 1.0
 * @date 01/31/2024
 */
public class BankAccountTest {

	public static void main(String[] args) {
		//Test 1
		BankAccount ba = new BankAccount("Nathan", "34T2G", 2348.90);
		System.out.println("Owner is: " + ba.getOwnerName());
		System.out.println("ID is: " + ba.getId());
		System.out.println("Balance is: " + ba.getBalance());
		
		System.out.println("------------------");
		
		//Test 2
		BankAccount bank = new BankAccount("James", "5Y49D", 1092.50);
		System.out.println("Owner is: " + bank.getOwnerName());
		System.out.println("ID is: " + bank.getId());
		System.out.println("Balance is: " + bank.getBalance());
		
		System.out.println("------------------");
		
		//Test 3 (Testing Setters)
		BankAccount banks = new BankAccount();
		banks.setOwnerName("Todd");
		
		System.out.println("Owner is: " + banks.getOwnerName());
		System.out.println("ID is: " + banks.getId());
		System.out.println("Balance is: " + banks.getBalance());
		
		System.out.println("------------------");
		
		//Test 4 (Testing deposit and withdraw methods)
		banks.deposit(100.00);
		System.out.println("$100.00 has been deposited");
		System.out.println(banks.getOwnerName() + "'s new balance is: " + banks.getBalance());
		banks.withdraw(50.00);
		System.out.println("$50.00 has been withdrawed");
		System.out.println(banks.getOwnerName() + "'s new balance is: " + banks.getBalance());
		
		System.out.println("------------------");
		
		//Test 5
		System.out.println(ba);
	}

}
