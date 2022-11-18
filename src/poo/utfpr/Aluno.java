package poo.utfpr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String ra;
	private String nome;
	private String nomeMeio;
	private String sobrenome;
	private String identidade;
	private String nacionalidade;
	private Date dataNascimento;
	private Date dataIngresso;
	private String situacao;
	private float coeficiente;
	private String curso;
	private String turno;
	private ArrayList<Disciplina> disciplinas;
	
	
	public Aluno(String ra, String nome, String nomeMeio, String sobrenome, String identidade, String nacionalidade, Date dataNascimento) {
		this.ra = ra;
		this.nome = nome;
		this.nomeMeio = nomeMeio;
		this.sobrenome = sobrenome;
		this.identidade = identidade;
		this.nacionalidade = nacionalidade;
		this.dataNascimento = dataNascimento;
		this.dataIngresso = new Date();
		this.situacao = "Regular";
		this.coeficiente = 0;
		this.curso = null;
		this.turno = null;
		this.disciplinas = new ArrayList<Disciplina>();
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
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public float getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(float coeficiente) {
		this.coeficiente = coeficiente;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Override
	public String toString() {
		String str = "Aluno: " + nome + " " + nomeMeio + " " + sobrenome
				+ "\nRA: " + ra + "\nIdentidade: " + identidade + "\nData de nascimento: " 
				+ dataNascimento + "\nData de ingresso: " + dataIngresso + "\nSituacao: "
				+ situacao + "\nCoeficiente: " + coeficiente + "\nCurso: " + curso +
				"\nDisciplinas: ";
		for (int i = 0; i<disciplinas.size(); i++) {
			str+= "\n ->" + disciplinas.get(i).getCodigo();
		}
		return str;
	}
	@Override
	public int compareTo(Aluno o) {
		if(this.coeficiente > o.coeficiente) return 1;
		else if(this.coeficiente == o.coeficiente) return 0;
		else return -1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(coeficiente, curso, dataIngresso, dataNascimento, disciplinas, identidade, nacionalidade,
				nome, nomeMeio, ra, situacao, sobrenome, turno);
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
		return Float.floatToIntBits(coeficiente) == Float.floatToIntBits(other.coeficiente)
				&& Objects.equals(curso, other.curso) && Objects.equals(dataIngresso, other.dataIngresso)
				&& Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(disciplinas, other.disciplinas) && Objects.equals(identidade, other.identidade)
				&& Objects.equals(nacionalidade, other.nacionalidade) && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeMeio, other.nomeMeio) && Objects.equals(ra, other.ra)
				&& Objects.equals(situacao, other.situacao) && Objects.equals(sobrenome, other.sobrenome)
				&& Objects.equals(turno, other.turno);
	}
}
