package POO;
import java.util.ArrayList;
import java.util.Date;

public class Professor {
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

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
			str+= "\n ->" + disciplinas.get(i).getNome();
		}
        return str;
    }

}