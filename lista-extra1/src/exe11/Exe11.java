package exe11;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		Double numero = Double.valueOf(ler.nextLine());
		System.out.println("O numero digitado foi " + numero + " e seu sucessor é " + (numero + 1));
	}

}
