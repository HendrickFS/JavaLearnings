package POO;

import java.util.ArrayList;
import java.util.Objects;

public class Disciplina {
	private String codigo;
	private String nome;
	private int ano;
	private int semestre;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private String modalidade;
	private int cargaHoraria;
	private String objetivo;
	private String ementa;
	private String bibliografia;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public String getBibliografia() {
		return bibliografia;
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public String toString() {
		String str = "Codigo: " + codigo + "\nNome: " + nome + "\nAno: " + ano
					+ "\nSemestre: " + semestre + "\nProfessor: " + professor.getNome() + "Alunos: ";
		for (int i = 0; i<alunos.size(); i++) {
			str+= "\n ->" + alunos.get(i).getNome();
		}
		str+= "\nModalidade: " + modalidade + "\nCarga horaria: " + cargaHoraria + "\nObjetivo: "
				+ objetivo + "\nEmenta: " + ementa + "\nBibliografia: " + bibliografia;
		return str;
	}
	
}
