package exe12;

import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		Double numero = Double.valueOf(ler.nextLine());
		String valor = (numero >= 0) ? "Número positivo" : "Número negativo";
		System.out.println(valor);
	}
}
