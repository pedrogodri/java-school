package exe20;

import java.util.Scanner;

public class Exe20 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		Double num1 = Double.valueOf(ler.nextLine());
		System.out.println("Digite o segundo numero: ");
		Double num2 = Double.valueOf(ler.nextLine());
		
		Double soma = Double.valueOf(num1 + num2);
		System.out.println("\n|***** Soma *****|\n" + num1 + " + " + num2 + " = " + soma + "\n");
		
		Double subtracao = Double.valueOf(num1 - num2);
		System.out.println("|***** Subtração *****|\n" + num1 + " - " + num2 + " = " + subtracao + "\n");
		
		Double multiplicacao = Double.valueOf(num1 * num2);
		System.out.println("|***** Subtração *****|\n" + num1 + " x " + num2 + " = " + multiplicacao + "\n");
		
		Double divisao = Double.valueOf(num1 / num2);
		System.out.println("|***** Subtração *****|\n" + num1 + " / " + num2 + " = " + divisao);
	}
}
