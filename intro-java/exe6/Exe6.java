package exe6;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer[] v = new Integer[10];
		Integer maior = new Integer(0);
		Integer menor = new Integer(999999999);
		for(int i = 0; i < v.length; i++) {
			System.out.print("Digite o " + i + " valor: ");
			v[i] = Integer.valueOf(ler.nextLine());
			
			if(v[i] > maior) {
				maior = v[i];
			}else if(v[i] < menor) {
				menor = v[i];
			}
		}
		System.out.println("O maior número = " + maior);
		System.out.println("O menor número = " + menor);
	}

}
