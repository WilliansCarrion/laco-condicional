package exercícios_generation;

import java.util.Scanner;

public class ExercicioLacoCondicionalJava2 {
	
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num1, num2, num3;
				
		System.out.println("Entre com o primeiro número: ");
		num1 = entrada.nextInt(); 
		System.out.println("Entre com o segundo número: ");
		num2 = entrada.nextInt();
		System.out.println("Entre com o terceiro número: ");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior número é: " + num3);
		}
				
		
	}
}
