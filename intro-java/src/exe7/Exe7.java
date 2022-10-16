package exe7;

public class Exe7 {

	public static void main(String[] args) {
		String[] v = new String[10];
		for(int i = 0; i<v.length; i++) {
			// String id = String.valueOf(i);
			v[i] = Integer.toString(i);
			System.out.println(i);
		}
		Integer tam = Integer.valueOf(v.length);
		System.out.println("\nTamanho da String: " + tam);
		Integer ultimo = Integer.valueOf(v[v.length-1]);
		System.out.println("O ultimo elemento da String: " + ultimo);
	}

}
