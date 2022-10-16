package exe15;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		Integer num = Integer.valueOf(ler.nextLine());
		if(num % 2 == 0)
		{
			System.out.println("O numero " + num + " é par!");
		}
		else
		{
			System.out.println("O numero " + num + " é ímpar!");
		}
	}
}
