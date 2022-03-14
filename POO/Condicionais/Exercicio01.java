package Java.POO.Condicionais;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		int A, B, C; 
		
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite um número: ");
			A=ler.nextInt();
			System.out.print("Digite um número: ");
			B=ler.nextInt();
			System.out.print("Digite um número: ");
			C=ler.nextInt();
		
			if ((A>B) && (A>C))
			{
				System.out.print("O maior número informado é: "+ A);
			}
			
		
			if ((B>A) && (B>C))
			{
				System.out.print("O maior número informado é: "+ B);
			}
			
		
			if ((C>A) && (C>B))
			{
				System.out.print("O maior número informado é: "+ C);
			}
				
		
	}
	

}
