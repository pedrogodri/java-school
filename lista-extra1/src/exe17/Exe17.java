package exe17;

import java.util.Scanner;

public class Exe17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o A: ");
		Double a = Double.valueOf(ler.nextLine());
		System.out.print("Digite o B: ");
		Double b = Double.valueOf(ler.nextLine());
		System.out.print("Digite o C: ");
		Double c = Double.valueOf(ler.nextLine());
		System.out.print("\nA = " + a + "\nB = " + b + "\nC = " + c);
		Double numeroRaizQ = Double.valueOf((Math.pow(b, 2) - 4 * a * c));
		if(numeroRaizQ >= 0 ) {
			Double raizQ = Double.valueOf(Math.sqrt(numeroRaizQ));
			Double x1 = Double.valueOf((-b + raizQ)/ 2 * a);
			Double x2 = Double.valueOf((-b - raizQ)/ 2 * a);
			System.out.println("\n\nX¹ = " + x1);
			System.out.println("X² = " + x2);
		}
		else {
			System.out.println("\n\nImpossivel calculacar raiz negativa");
		}
	}
}
