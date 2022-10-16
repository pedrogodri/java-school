package exe10;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double[] notas = new Double[3];
		System.out.print("Nome do aluno: ");
		String nome = ler.nextLine();
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota: ");
			notas[i] = Double.valueOf(ler.nextLine());
		}
		Double media = Double.valueOf(calcMedia(notas));
		System.out.println("\nNome do aluno: " + nome);
		System.out.println("Media: " + media);
	}

	public static double calcMedia(Double[] notas) {
		Double soma = 0.0;
		Double media;
		for(int i = 0; i<3; i++) {
			soma = soma + notas[i];
		}
		media = soma/3;
		return media;
	}
}
