package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		Cachorro cachorro3 = new Cachorro();
		
		ArrayList<Cachorro> listaCachorro = new ArrayList<>();
		ArrayList<Gato> listaGato = new ArrayList<>();
		
		System.out.println("Nome do gato: ");
		gato1.setNome(ler.nextLine());
		System.out.println("Raça do gato: ");
		gato1.setRaca(ler.nextLine());
		System.out.println("Número de patas do gato: ");
		gato1.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do gato: ");
		gato1.setComprimento(Float.valueOf(ler.nextLine()));
		System.out.println("Ecosistema do gato:");
		gato1.setEcoSistema(ler.nextLine());
		
		System.out.println("Nome do gato: ");
		gato2.setNome(ler.nextLine());
		System.out.println("Raça do gato: ");
		gato2.setRaca(ler.nextLine());
		System.out.println("Número de patas do gato: ");
		gato2.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do gato: ");
		gato2.setComprimento(Float.valueOf(ler.nextLine()));
		gato2.setEcoSistema(ler.nextLine());
		
		System.out.println("Nome do gato: ");
		gato3.setNome(ler.nextLine());
		System.out.println("Raça do gato: ");
		gato3.setRaca(ler.nextLine());
		System.out.println("Número de patas do gato: ");
		gato3.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do gato: ");
		gato3.setComprimento(Float.valueOf(ler.nextLine()));
		System.out.println("Ecosistema do gato:");
		gato3.setEcoSistema(ler.nextLine());
		
		System.out.println("Nome do cachoro: ");
		cachorro1.setNome(ler.nextLine());
		System.out.println("Raça do cachoro: ");
		cachorro1.setRaca(ler.nextLine());
		System.out.println("Número de patas do cachoro: ");
		cachorro1.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do cachoro: ");
		cachorro1.setComprimento(Float.valueOf(ler.nextLine()));
		System.out.println("Ecosistema do cachoro:");
		cachorro1.setEcoSistema(ler.nextLine());
		
		System.out.println("Nome do cachoro: ");
		cachorro2.setNome(ler.nextLine());
		System.out.println("Raça do cachoro: ");
		cachorro2.setRaca(ler.nextLine());
		System.out.println("Número de patas do cachoro: ");
		cachorro2.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do cachoro: ");
		cachorro2.setComprimento(Float.valueOf(ler.nextLine()));
		System.out.println("Ecosistema do cachoro:");
		cachorro2.setEcoSistema(ler.nextLine());
		
		System.out.println("Nome do cachoro: ");
		cachorro3.setNome(ler.nextLine());
		System.out.println("Raça do cachoro: ");
		cachorro3.setRaca(ler.nextLine());
		System.out.println("Número de patas do cachoro: ");
		cachorro3.setNumeroPatas(Integer.valueOf(ler.nextLine()));
		System.out.println("Comprimento do cachoro: ");
		cachorro3.setComprimento(Float.valueOf(ler.nextLine()));
		System.out.println("Ecosistema do cachoro:");
		cachorro3.setEcoSistema(ler.nextLine());
		
		listaCachorro.add(cachorro1);
		listaCachorro.add(cachorro2);
		listaCachorro.add(cachorro3);
		
		listaGato.add(gato1);
		listaGato.add(gato2);
		listaGato.add(gato3);
		
		for (Gato gato : listaGato) {
			System.out.println("Nome: " + gato.getNome());
			System.out.println("Raça: " + gato.getRaca());
			System.out.println("Número de patas: " + gato.getNumeroPatas());
			System.out.println("Comprimento: " + gato.getCor());
			System.out.println("Ecosistema: " + gato.getEcoSistema());
			gato.miar();
			System.out.println("\n\n");
		}
		
		for (Cachorro cachorro : listaCachorro) {
			System.out.println("Nome: " + cachorro.getNome());
			System.out.println("Raça: " + cachorro.getRaca());
			System.out.println("Número de patas: " + cachorro.getNumeroPatas());
			System.out.println("Comprimento: " + cachorro.getCor());
			System.out.println("Ecosistema: " + cachorro.getEcoSistema());
			cachorro.latir();
			System.out.println("\n\n");
		}
		ler.close();
	}
}
