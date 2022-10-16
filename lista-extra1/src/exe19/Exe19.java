package exe19;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		Integer num1 = Integer.valueOf(ler.nextLine());
		System.out.println("Digite o segundo numero: ");
		Integer num2 = Integer.valueOf(ler.nextLine());
		Integer soma = Integer.valueOf(num1 + num2);
		System.out.println("|***** Soma *****|\n" + num1 + " + " + num2 + " = " + soma);
	}
}
