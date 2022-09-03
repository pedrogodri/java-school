package exe8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		for(int i = 0; i<10; i++) {
			System.out.println("Digite o valor: ");
			String el = ler.nextLine();
			if(!el.isEmpty()) {
				lista.add(el);
			}
		}
		for (String elemento : lista) {
			System.out.println("Valores da lista: " + elemento);
		}
		String tam = String.valueOf(lista.size());
		System.out.println("\nTamanho da lista: " + tam);
		String ultimo = String.valueOf(lista.get(lista.size()-1));
		System.out.println("Ultimo valor da lista: " + ultimo);
	}
}
