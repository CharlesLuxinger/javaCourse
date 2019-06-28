package byteBankHerdado;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario func) {
		double boni = func.getBonificacao();
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}
}
