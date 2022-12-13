package POO;

import java.util.ArrayList;
import java.util.Date;

public class Aluno {
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
	
	public String toString() {
		String str = "Aluno: " + nome + " " + nomeMeio + " " + sobrenome
				+ "\nRA: " + ra + "\nIdentidade: " + identidade + "\nData de nascimento: " 
				+ dataNascimento + "\nData de ingresso: " + dataIngresso + "\nSituacao: "
				+ situacao + "\nCoeficiente: " + coeficiente + "\nCurso: " + curso +
				"\nDisciplinas: ";
		for (int i = 0; i<disciplinas.size(); i++) {
			str+= "\n ->" + disciplinas.get(i).getNome();
		}
		return str;
	}
}
