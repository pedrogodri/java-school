package exe13;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a base: ");
		Double base = Double.valueOf(ler.nextLine());
		System.out.println("Digite a altura: ");
		Double altura = Double.valueOf(ler.nextLine());
		Double area = Double.valueOf((base*altura)/2);
		System.out.println("A área do triângulo = " + area);
	}
}
