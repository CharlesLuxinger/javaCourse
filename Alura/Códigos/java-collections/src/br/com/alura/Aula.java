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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aula == null) ? 0 : aula.hashCode());
		result = prime * result + ((tempo == null) ? 0 : tempo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (aula == null) {
			if (other.aula != null)
				return false;
		} else if (!aula.equals(other.aula))
			return false;
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
		return true;
	}
}
