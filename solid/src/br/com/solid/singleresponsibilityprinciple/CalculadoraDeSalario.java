package br.com.solid.singleresponsibilityprinciple;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario){
		return funcionario.calcularSalario();
	}

}