package exe18;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite o cateto adjacente: ");
		Double ca = Double.valueOf(ler.nextLine());
		System.out.println("Digite o cateto oposto: ");
		Double co = Double.valueOf(ler.nextLine());
		System.out.println("Digite o hipotenusa: ");
		Double h = Double.valueOf(ler.nextLine());
		if(ca == co && co == h) {
			System.out.println("Triângulo Equilátero");
		}else if(ca == co || ca == h || co == h) {
			System.out.println("Triângulo Isóceles");
		}else {
			System.out.println("Triângulo Escaleno");
		}
	}
}
