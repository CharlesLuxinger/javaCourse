package entities;

public class CompanyPerson extends Person{
	private Integer numberEmployees;

	public CompanyPerson(String name, Double anualIcome, Integer numberEmployees) {
		super(name, anualIcome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumeroFuncionarios() {
		return numberEmployees;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numberEmployees = numeroFuncionarios;
	}
	
	public final double calcImpostos() {
		if (this.numberEmployees <= 10) {
			return (super.anualIcome * 0.16);
		}
		return (super.anualIcome * 0.14);
	}
	
}
