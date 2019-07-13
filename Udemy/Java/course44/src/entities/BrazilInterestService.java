package entities;

public class BrazilInterestService implements InterestService {
	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRated() {
		return interestRate;
	}
}
