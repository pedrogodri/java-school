package exe21;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite valor de A: ");
		Integer a = Integer.valueOf(ler.nextLine());
		System.out.println("Digite valor de B: ");
		Integer b = Integer.valueOf(ler.nextLine());
		System.out.println("Valor incial A:  " + a + "\n" + "Valor incial B: " + b);
		Integer troca = Integer.valueOf(a);
		a = b;
		b = troca;
		System.out.println("\nValor trocado A:  " + a + "\n" + "Valor trocado B: " + b);
	}
}
