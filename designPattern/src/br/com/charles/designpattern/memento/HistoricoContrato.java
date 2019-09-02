package br.com.charles.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoContrato {
	private List<Estado> estadosSalvos = new ArrayList<Estado>();

	public Estado getEstado(int index) {
		return estadosSalvos.get(index);
	}

	public void addEstado(Estado estado) {
		estadosSalvos.add(estado);
	}
}
