package exerc�cios_generation;

import java.util.Scanner;

public class ExercicioLacoCondicionalJava1 {

	public static void main (String args[])
	{
		{
		
		int imputIdade;
		Scanner entrada = new Scanner (System.in);		
		
		System.out.println("Digite sua idade: ");
		imputIdade = entrada.nextInt();
		
		
		if (imputIdade >=10 && imputIdade <=14)
			{
				System.out.println("Voc� est� na categoria infantil");
				imputIdade = entrada.nextInt();
			}
		else if (imputIdade >=15 && imputIdade <=17) 
			{
				System.out.println("Voc� est� na categoria juvenil");
				imputIdade = entrada.nextInt();
			}
		else if (imputIdade >=18 && imputIdade <=60)
			{
				System.out.println("Voc� est� na categoria adulto");
				imputIdade = entrada.nextInt();
			}
		else if (imputIdade >60) 
			{
				System.out.println("Voc� est� na categoria idoso");
				imputIdade = entrada.nextInt();
			}
		else 
		{
			System.out.println("Voc� � novo demais para nata��o, espere um pouco.");
		}
		}
		
			
	}
}

