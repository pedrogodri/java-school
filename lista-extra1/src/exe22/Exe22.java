package exe22;

public class Exe22 {
	public static void main(String[] args) {
		Integer tabuada;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				tabuada = i * j;
				System.out.println(i + " x " + j + " = " + tabuada);
			}
			System.out.println("\n");
		}
	}
}
