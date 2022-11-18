package poo.utfpr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Professor implements Comparable<Professor>{
	 	private String matricula;
		private String nome;
		private String nomeMeio;
		private String sobrenome;
	    private String identidade;
	    private String nacionalidade;
	    private Date dataNascimento;
	    private Date dataAdmissao;
	    private String departamento;
	    private ArrayList<Disciplina> disciplinas;
	    
	    public Professor(String matricula, String nome, String nomeMeio, String sobrenome, String identidade, String nacionalidade, Date dataNascimento, Date dataAdmissao) {
	    	this.matricula = matricula;
	    	this.nome = nome;
	    	this.nomeMeio = nomeMeio;
			this.sobrenome = sobrenome;
			this.identidade = identidade;
			this.nacionalidade = nacionalidade;
			this.dataNascimento = dataNascimento;
			this.dataAdmissao = dataAdmissao;
			this.departamento = null;
			this.disciplinas = new ArrayList<Disciplina>();
	    }


	    public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
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
		public Date getDataAdmissao() {
			return dataAdmissao;
		}
		public void setDataAdmissao(Date dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public ArrayList<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		
	
		public String toString(){
	        String str = "";
	        str += "Matricula: " + this.matricula;
	        str += "\nNome: " + this.nome + " " + this.nomeMeio + " " + this.sobrenome;
	        str += "\nIdentidade: " + this.identidade;
	        str += "\nNacionalidade: " + this.nacionalidade;
	        str += "\nData de nascimento: " + this.dataNascimento;
	        str += "\nData de admissao: " + this.dataAdmissao;
	        str += "\nDepartamento: " + this.departamento;
	        str += "\nDisciplinas: ";
	        for (int i = 0; i<disciplinas.size(); i++) {
				str+= "\n ->" + disciplinas.get(i).getCodigo();
			}
	        return str;
	    }
		@Override
		public int compareTo(Professor o) {
			return this.sobrenome.compareTo(o.sobrenome);
		}
		@Override
		public int hashCode() {
			return Objects.hash(dataAdmissao, dataNascimento, departamento, disciplinas, identidade, matricula,
					nacionalidade, nome, nomeMeio, sobrenome);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Professor other = (Professor) obj;
			return Objects.equals(dataAdmissao, other.dataAdmissao)
					&& Objects.equals(dataNascimento, other.dataNascimento)
					&& Objects.equals(departamento, other.departamento)
					&& Objects.equals(disciplinas, other.disciplinas) && Objects.equals(identidade, other.identidade)
					&& Objects.equals(matricula, other.matricula) && Objects.equals(nacionalidade, other.nacionalidade)
					&& Objects.equals(nome, other.nome) && Objects.equals(nomeMeio, other.nomeMeio)
					&& Objects.equals(sobrenome, other.sobrenome);
		}
		

}
