package poo.utfpr;

import java.util.ArrayList;
import java.util.Objects;

public class Disciplina implements Comparable<Disciplina> {
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
	
	public Disciplina(String codigo, String nome, int ano, int semestre, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
		this.alunos = new ArrayList<Aluno>();
		this.modalidade = "Presencial";
		this.cargaHoraria = 0;
		this.objetivo = "";
		this.ementa = "";
		this.bibliografia = "";
	}
	
	
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
			str+= "\n ->" + alunos.get(i).getSobrenome();
		}
		str+= "\nModalidade: " + modalidade + "\nCarga horaria: " + cargaHoraria + "\nObjetivo: "
				+ objetivo + "\nEmenta: " + ementa + "\nBibliografia: " + bibliografia;
		return str;
	}
	@Override
	public int compareTo(Disciplina o) {
		return this.codigo.compareTo(o.codigo);
	}
	@Override
	public int hashCode() {
		return Objects.hash(alunos, ano, bibliografia, cargaHoraria, codigo, ementa, modalidade, nome, objetivo,
				professor, semestre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(alunos, other.alunos) && ano == other.ano
				&& Objects.equals(bibliografia, other.bibliografia) && cargaHoraria == other.cargaHoraria
				&& Objects.equals(codigo, other.codigo) && Objects.equals(ementa, other.ementa)
				&& Objects.equals(modalidade, other.modalidade) && Objects.equals(nome, other.nome)
				&& Objects.equals(objetivo, other.objetivo) && Objects.equals(professor, other.professor)
				&& semestre == other.semestre;
	}
	
	
}
