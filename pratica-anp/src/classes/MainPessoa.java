package classes;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do prefessor:");
		professor.setNome(ler.nextLine());
		System.out.println("Digite o cpf do prefessor: ");
		professor.setCpf(ler.nextLine());
		System.out.println("Digite o siape do prefessor: ");
		professor.setSiape(Integer.valueOf(ler.nextLine()));
		
		System.out.println("\n\nNome do professor: " + professor.getNome());
		System.out.println("CPF do professor: " + professor.getCpf());
		System.out.println("Siape do profesor: " + professor.getSiape() + "\n\n");
		
		System.out.println("Digite o nome do aluno");
		aluno.setNome(ler.nextLine());
		System.out.println("Digite o cpf do aluno: ");
		aluno.setCpf(ler.nextLine());
		System.out.println("Digite a matricula do aluno: ");
		aluno.setMatricula(Integer.valueOf(ler.nextLine()));
		
		System.out.println("\n\nNome do aluno: " +aluno.getNome());
		System.out.println("CPf do aluno: " + aluno.getCpf());
		System.out.println("Matricula do aluno: " + aluno.getMatricula());
	}

}
