package exerc�cios_generation;

import java.util.Scanner;

public class ExercicioLacoCondicionalJava2 {
	
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num1, num2, num3;
				
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = entrada.nextInt(); 
		System.out.println("Entre com o segundo n�mero: ");
		num2 = entrada.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior n�mero �: " + num3);
		}
				
		
	}
}
