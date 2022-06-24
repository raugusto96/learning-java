package Programacao_orientada_objetos.introducao.entities;

public class Holder {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Holder(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public Holder(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + accountNumber
		+ ", Holder: " + name
		+ ", Balance: $ " + String.format("%.2f", balance);
	}
}
