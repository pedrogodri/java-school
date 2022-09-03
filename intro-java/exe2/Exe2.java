package exe2;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = ler.nextLine();
		System.out.print("Digite sua idade: ");
		Integer idade = Integer.valueOf(ler.nextLine());
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
	}

}
