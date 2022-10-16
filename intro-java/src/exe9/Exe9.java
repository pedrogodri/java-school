package exe9;

import java.util.Scanner;

public class Exe9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o preço da gasolina: ");
		Double precoLitro = Double.valueOf(ler.nextLine());
		System.out.print("Digite a quantida de litros de gasolina: ");
		Double quantidadeLitros = Double.valueOf(ler.nextLine());
		
		Double valorF = Double.valueOf(calcPreco(precoLitro, quantidadeLitros));
	}
	public static Double calcPreco(Double precoLitro, Double quantidadeLitros) {
		if(quantidadeLitros == null) {
			System.out.println("Valor Nulo");
		}
		
		Double valorF = Double.valueOf(precoLitro * quantidadeLitros);
		System.out.println("Valor final: " + valorF);
		return valorF;
	}
}
