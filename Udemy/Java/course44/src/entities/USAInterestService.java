package entities;

public class USAInterestService implements InterestService {
	private Double interestRate;

	public USAInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRated() {
		return interestRate;
	}

}
