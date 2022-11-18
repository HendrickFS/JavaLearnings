package poo.aluno;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String ra;
	private String nome;
	private String nomeMeio;
	private String sobrenome;
	private String dataNascimento;
	private float mediaAtual;
	
	public Aluno() {
		this.ra = "0000000";
		this.nome = "Aluno";
		this.nomeMeio = "Desconhecido";
		this.sobrenome = "Adicionado";
		this.dataNascimento = "00/00/00";
		this.mediaAtual = 0;
	}
	
	public Aluno(String ra, String nome, String nomeMeio, String sobrenome, String dataNascimento, Float mediaAtual) {
		this.ra = ra;
		this.nome = nome;
		this.nomeMeio = nomeMeio;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.mediaAtual = mediaAtual;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMeio() {
		return nomeMeio;
	}
	public void setNomeMeio(String nomeMeio) {
		this.nomeMeio = nomeMeio;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public float getMediaAtual() {
		return mediaAtual;
	}
	public void setMediaAtual(float mediaAtual) {
		this.mediaAtual = mediaAtual;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nMédia: " + mediaAtual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, mediaAtual, nome, nomeMeio, ra, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataNascimento, other.dataNascimento)
				&& Float.floatToIntBits(mediaAtual) == Float.floatToIntBits(other.mediaAtual)
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeMeio, other.nomeMeio)
				&& Objects.equals(ra, other.ra) && Objects.equals(sobrenome, other.sobrenome);
	}

	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareTo(o.nome);
	}
	
}
