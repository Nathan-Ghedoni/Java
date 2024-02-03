/**
 * This class creates a BankAccount that includes the owner's name, account id, and the current balance.
 * @author Nathan Ghedoni
 * @version 1.0
 * @date 01/31/2024
 */
public class BankAccount {
	
	//Fields
	private String ownerName;
	private String id;
	private double balance;
	
	//Constructors
	/**
	 * This creates a bank account that doesn't have an assigned user, account ID, and a balance of 0.0.
	 */
	public BankAccount() {
		this.ownerName = "Not a real user.";
		this.id = "No valid ID";
		this.balance = 0.0;
	}
	/**
	 * This creates a bank account and specifies the owner's name, account id, and the balance.
	 * @param ownerName The name of the person who owns this bank account.
	 * @param id The account id of the bank account.
	 * @param balance The amount of money in the bank account.
	 */
	public BankAccount(String ownerName, String id, double balance) {
		this.ownerName = ownerName;
		this.id = id;
		this.balance = balance;
	}
	
	//Setter and Getters
	/**
	 * Returns the owner's name of this bank account
	 * @return the owner's name for this bank account
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	//Precondition: Make sure ownerName only contains letters
	/**
	 * Assigns the owner's name to this bank account
	 * @param ownerName The name of the person who owns this bank account.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * Returns the account id for this bank account.
	 * @return the account id for this bank account.
	 */
	public String getId() {
		return id;
	}
	/**
	 * Returns the current amount of money in this bank account.
	 * @return the current amount of money in this bank account.
	 */
	public double getBalance() {
		return balance;
	}
	
	//Methods
	
	//Precondition: amount>=0.0
	/**
	 * Adds a specified amount of money to the current balance of the bank account.
	 * @param amount An amount of money to be added to the bank account's balance.
	 */
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	//Precondition: amount<=this.balance
	//Precondition: amount>=0.0
	/**
	 * Removes a specified amount of money from the current balance of the bank account.
	 * @param amount An amount of money to be removed from the bank account's balance.
	 */
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	/**
	 * Creates a string that identifies the owner, account id, and current balance of this bank account.
	 * @return a string that identifies the owner, account id, and current balance of this bank account.
	 */
	public String toString() {
		return "BankAccount for: " + ownerName + ", Account ID: " + id + ", Balance: $" + balance;
	}
	
}
