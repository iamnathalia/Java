package Java.POO;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int n, soma=0, impar=0; 
		Scanner ler = new Scanner(System.in);
		
	
						do 
						{
							System.out.print("Digite um n�mero: ");
							n=ler.nextInt();
						
								if (n%3==0)
								{
									impar++;
									soma = (soma+n);
								}
							
						}
						
						while (n!=0);
						
					System.out.println("A m�dia � de:"+ soma/impar);
	}
					
}
	