package Java.Repeticoes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int idade, menor=0, maior=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Olá insira sua idade à seguir: ");
		System.out.println("\nPara finalizar digite -99");
		idade=ler.nextInt();
			
				while (idade!=-99)	
				{  
					System.out.print("Insira sua idade: ");
					idade=ler.nextInt();
					
					if (idade<=21) 
					{
						menor++;
					}
					
					if (idade>=50);
					{
						maior++;
					}
					
				}
				System.out.printf("\nNumero total de pessoas com menos de 21 anos: %d", menor);
				System.out.printf("\nNumero total de pessoas com mais de 50 anos: %d", maior);		
					
					
		}
			
	
}
