package Java.Repeticoes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int n, soma=0;
		Scanner ler = new Scanner(System.in);
		
	
						do 
						{
							System.out.print("Digite um número: ");
							n=ler.nextInt();
							soma = (soma+n);
						
						}
					
						while (n!=0);
						
					System.out.print("\nA soma dos numeros de 1 a "+n+" é de "+ soma);	
		}
					
}
	



