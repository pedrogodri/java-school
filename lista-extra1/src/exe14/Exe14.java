package exe14;

import java.util.Scanner;

public class Exe14 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		Integer num1 = Integer.valueOf(ler.nextLine());
		System.out.println("Digite o segundo valor: ");
		Integer num2 = Integer.valueOf(ler.nextLine());
		System.out.println("Digite o terceiro valor: ");
		Integer num3 = Integer.valueOf(ler.nextLine());
		
		if(num1 > num2 && num2 > num3) 
		{
			System.out.println("O maior numero é: " + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("O maior numero é: " + num2);
		}
		else
		{
			System.out.println("O maior número é: " + num3);
		}
	}

}
