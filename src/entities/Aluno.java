package entities;

public class Aluno {
	
	private String nome;
	private Double nota01;
	private Double nota02;
	
	public Aluno() {}

	public Aluno(String nome, Double nota01, Double nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota01() {
		return nota01;
	}

	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}

	public Double getNota02() {
		return nota02;
	}

	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}
	
	public double mediaPonderada() {
		return (this.nota01 * 2 + this.nota02*3) / 5;
	}
	
	public boolean reprovado() {
		if(this.mediaPonderada() < 7) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota01=" + nota01 + ", nota02=" + nota02 + ", mediaPonderada()="
				+ mediaPonderada() + "]";
	}
	
	
}
