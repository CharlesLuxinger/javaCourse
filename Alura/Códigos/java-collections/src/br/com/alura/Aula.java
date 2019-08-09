package br.com.alura;

public class Aula implements Comparable<Aula> {
	private String aula;
	private Integer tempo;

	public Aula(String aula, Integer tempo) {
		this.aula = aula;
		this.tempo = tempo;
	}

	public String getAula() {
		return aula;
	}

	public Integer getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return aula + ", " + tempo + " min";
	}

	@Override
	public int compareTo(Aula other) {
			return other.aula.compareTo(aula);
	}
}
