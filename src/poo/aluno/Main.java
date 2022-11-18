package poo.aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
	public static void main (String [] args) {
		ArrayList<Aluno> alunoList= new ArrayList<Aluno> ();
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantos alunos: ");
		int n = scan.nextInt();
		for (int i = 0; i<n ; i++) {
			System.out.println("Digite o ra do aluno: ");
			String ra = scan.next();
			System.out.println("Digite o nome do aluno: ");
			String nome = scan.next();
			System.out.println("Digite o nome meio do aluno: ");
			String nomeMeio = scan.next();
			System.out.println("Digite o sobrenome do aluno: ");
			String sobreNome = scan.next();
			System.out.println("\tDigite a data de nascimento do aluno: ");
			String dataNascimento = scan.next();
			System.out.println("Digite a media do aluno: ");
			float mediaAtual = scan.nextFloat();
			
			Aluno A1 = new Aluno(ra, nome, nomeMeio, sobreNome, dataNascimento, mediaAtual);
			alunoList.add(A1);
			
			
		}
		System.out.println(alunoList);
		alunoList.sort(null);
		
	}

}
