package entities;

public class IndividualPerson extends Person {
	private Double healthExpenditures;

	public IndividualPerson(String name, Double anualIcome, Double healthExpenditures) {
		super(name, anualIcome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getRendaAnual() {
		return healthExpenditures;
	}

	public void setRendaAnual(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final double calcImpostos() {
		if (super.anualIcome < 20000.0) {
			if (this.healthExpenditures != 0) {
				return (super.anualIcome * 0.15) - (healthExpenditures * 0.5);
			}
			return (super.anualIcome * 0.15);

		} else if (this.healthExpenditures != 0) {
			return (super.anualIcome * 0.25) - (healthExpenditures * 0.5);
		}
		return (super.anualIcome * 0.25);

	}
}
