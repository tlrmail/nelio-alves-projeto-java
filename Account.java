package br.pe.tlrcampos.entities;

public class Account {

	private String holder;
	private Integer number;
	private Double balance;
	private static final Double TAX = 5.00;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String holder, Integer number, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	
	public void deposit(Double value) {
		this.balance = this.balance + value;
	}
	
	public void withdraw(Double value) {
		this.balance = this.balance - value - TAX;
	}
	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account data: \n Account "+number+", Holder:" + holder + ", Balance=" + balance;
	}

}
