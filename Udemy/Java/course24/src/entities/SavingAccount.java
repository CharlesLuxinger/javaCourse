package entities;

public class SavingAccount extends Account {
	
	private Double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		super.deposit(super.getBalance() * interestRate);
	}
	
	/*• Palavra chave: final
	• Classe: evita que a classe seja herdada
	public final class SavingsAccount {}
	• Método: evita que o método sob seja sobreposto
	 */
	@Override
	public final void withDraw(double amount) {
		balance -= amount;
	}

}
