package entities;

public abstract class Person {

	private String name;
	protected Double anualIcome;

	public Person(String name, Double anualIcome) {
		super();
		this.name = name;
		this.anualIcome = anualIcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return anualIcome;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.anualIcome = rendaAnual;
	}

	public abstract double calcImpostos();
}
