package classes;

import java.util.ArrayList;

public class AnimalMain {
	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		Cachorro cachorro3 = new Cachorro();
		
		ArrayList<Cachorro> listaCachorro = new ArrayList<>();
		ArrayList<Gato> listaGato = new ArrayList<>();
		
		cachorro1.setNome("Skye");
		cachorro1.setRaca("Lhasa apso");
		cachorro1.setNumeroPatas(4);
		cachorro1.setComprimento((float) 25.50);
		cachorro1.setCor("Branco");
		cachorro1.setEcoSistema("Urbano");
		
		cachorro2.setNome("Iris");
		cachorro2.setRaca("Vira lata");
		cachorro2.setNumeroPatas(4);
		cachorro2.setComprimento((float) 70);
		cachorro2.setCor("Caramelo");
		cachorro2.setEcoSistema("Urbano");
		
		cachorro3.setNome("Amora");
		cachorro3.setRaca("Golden");
		cachorro3.setNumeroPatas(4);
		cachorro3.setComprimento((float) 59.48);
		cachorro3.setCor("Dourado claro");
		cachorro3.setEcoSistema("Urbano");
		
		gato1.setNome("Afonso");
		gato1.setRaca("Persa");
		gato1.setNumeroPatas(4);
		gato1.setComprimento((float)25);
		gato1.setCor("Marrom");
		gato1.setEcoSistema("Urbano");
		
		gato2.setNome("Fiona");
		gato2.setRaca("Siamês");
		gato2.setNumeroPatas(4);
		gato2.setComprimento((float)28.98);
		gato2.setCor("Cinza");
		gato2.setEcoSistema("Rural");
		
		gato3.setNome("Bartolomeu");
		gato3.setRaca("Maine Coon");
		gato3.setNumeroPatas(4);
		gato3.setComprimento((float)60);
		gato3.setCor("Mesclado - Preto e Branco");
		gato3.setEcoSistema("Urbano");
		
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
	}
}
