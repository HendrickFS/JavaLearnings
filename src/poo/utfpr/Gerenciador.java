package poo.utfpr;

import java.util.ArrayList;
import java.util.Date;

interface IAtualizaAluno{
	String ra = null;
	String nome = null;
	String nomeMeio = null;	String sobrenome = null;	String identidade = null;	String nacionalidade = null;	Date dataNascimento = null;	Date dataIngresso = null;	String situacao = null;	float coeficiente = -1;	String curso = null;	String turno = null;	ArrayList<Disciplina> disciplinas = null;
}

public class Gerenciador {
	
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Disciplina> disciplinas;
	
	public Boolean cadastarAluno(String ra, String nome, String nomeMeio, String sobrenome, String identidade, String nacionalidade, Date dataNascimento) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getRa() == ra) return false;
		}
		Aluno aluno = new Aluno(ra, nome, nomeMeio, sobrenome, identidade, nacionalidade, dataNascimento);
		alunos.add(aluno);
		return true;
	}
	
	public Boolean removerAluno(String ra) {
		for(int i = 0;i < alunos.size(); i++) {
			if(alunos.get(i).getRa() == ra) {
				alunos.remove(i);
				return true;
			}
		}
		return false;
	}

	public Boolean atualizarAluno() {
		return true;
	}
	
	public void verAlunos() {
		for(int i = 0; i < alunos.size(); i++) System.out.println(alunos.get(i));
	}
	
	public void verAlunosOrdenados() {
		
	}
	
	public void buscarAluno(String ra) {
		for(int i = 0; i < alunos.size(); i++) if(alunos.get(i).getRa() == ra) System.out.println(alunos.get(i));
	}
	
	public void buscarAlunoNome(String nome) {
		for(int i = 0; i < alunos.size(); i++) if(alunos.get(i).getNome() == nome) System.out.println(alunos.get(i));
	}
	
	public void buscarAlunoSobrenome(String sobrenome) {
		for(int i = 0; i < alunos.size(); i++) if(alunos.get(i).getSobrenome() == sobrenome) System.out.println(alunos.get(i));
	}
	
	public void buscarAlunoSituacao(String situacao) {
		for(int i = 0; i < alunos.size(); i++) if(alunos.get(i).getSituacao() == situacao) System.out.println(alunos.get(i));
	}
	
	public void buscarAlunoCurso(String curso) {
		for(int i = 0; i < alunos.size(); i++) if(alunos.get(i).getCurso() == curso) System.out.println(alunos.get(i));
	}
	
	
	
	public Boolean cadastarProfessor(String matricula, String nome, String nomeMeio, String sobrenome, String identidade, String nacionalidade, Date dataNascimento, Date dataAdmissao) {
		for(int i = 0; i < alunos.size(); i++) {
			if(professores.get(i).getMatricula() == matricula) return false;
		}
		Professor professor = new Professor(matricula, nome, nomeMeio, sobrenome, identidade, nacionalidade, dataNascimento, dataAdmissao);
		professores.add(professor);
		return true;
	}
	
	public Boolean removerProfessor(String matricula) {
		for(int i = 0;i < professores.size(); i++) {
			if(professores.get(i).getMatricula() == matricula) {
				professores.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Boolean atualizarProfessor() {
		return true;
	}
	
	public void verProfessores() {
		for(int i = 0; i < professores.size(); i++) System.out.println(professores.get(i));
	}
	
	public void verProfessoresOrdenados() {
		
	}
	
	public void buscarProfessor(String matricula) {
		for(int i = 0; i < professores.size(); i++) if(professores.get(i).getMatricula() == matricula) System.out.println(professores.get(i));
	}
	
	
	
	public Boolean cadastarDisciplina(String codigo, String nome, int ano, int semestre, Professor professor) {
		for(int i = 0; i < alunos.size(); i++) if(disciplinas.get(i).getCodigo() == codigo) return false;
		Disciplina disciplina = new Disciplina(codigo, nome, ano, semestre, professor);
		disciplinas.add(disciplina);
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i) == professor) {
				ArrayList<Disciplina> disciplinasProfessor = professores.get(i).getDisciplinas();
				disciplinasProfessor.add(disciplina);
				professores.get(i).setDisciplinas(disciplinasProfessor);
			}
		}
		return true;
	}
	
	public Boolean removerDisciplina(String codigo) {
		for(int i = 0; i < professores.size(); i++) {
			ArrayList<Disciplina> disciplinasProfessor = professores.get(i).getDisciplinas();
			for(int j = 0; j < disciplinasProfessor.size(); j++) if(disciplinasProfessor.get(i).getCodigo() == codigo) disciplinasProfessor.remove(j);
			professores.get(i).setDisciplinas(disciplinasProfessor);
		}
		for(int i = 0; i < alunos.size(); i++) {
			ArrayList<Disciplina> disciplinasAluno = alunos.get(i).getDisciplinas();
			for(int j = 0; j < disciplinasAluno.size(); j++) if(disciplinasAluno.get(i).getCodigo() == codigo) disciplinasAluno.remove(j);
			alunos.get(i).setDisciplinas(disciplinasAluno);
		}
		for(int i = 0;i < disciplinas.size(); i++) {
			if(disciplinas.get(i).getCodigo() == codigo) {
				disciplinas.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void verDisciplinas() {
		for(int i = 0; i < disciplinas.size(); i++) System.out.println(disciplinas.get(i));
	}
}
