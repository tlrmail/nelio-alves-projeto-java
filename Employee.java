package br.pe.tlrcampos.entities;

public class Employee {

	private String nome;
	private Double grossSalary;
	private Double tax;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String nome, Double grossSalary, Double tax) {
		this.nome = nome;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public Double netSalary() {
		return this.grossSalary - this.tax;
	}

	public Double increaseSalary(Double percentage) {
		return this.netSalary() + (this.grossSalary * percentage / 100);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Employee: nome=" + nome + ", grossSalary=" + String.format("%.2f", grossSalary) + ", tax="
				+ String.format("%.2f", tax);
	}

}
