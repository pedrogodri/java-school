package exe4;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			Integer num = Integer.valueOf(ler.nextLine());
			System.out.println("Valor lido: \n" + num);
		}
	}

}
