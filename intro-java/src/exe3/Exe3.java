package exe3;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		Integer num = Integer.valueOf(ler.nextLine());
		if (num % 2 == 0) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é ímpar");
		}
	}

}
