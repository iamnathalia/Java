package Java.POO.Condicionais;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		int A, B, C; 
		
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite um n�mero: ");
			A=ler.nextInt();
			System.out.print("Digite um n�mero: ");
			B=ler.nextInt();
			System.out.print("Digite um n�mero: ");
			C=ler.nextInt();
		
			if ((A>B) && (A>C))
			{
				System.out.print("O maior n�mero informado �: "+ A);
			}
			
		
			if ((B>A) && (B>C))
			{
				System.out.print("O maior n�mero informado �: "+ B);
			}
			
		
			if ((C>A) && (C>B))
			{
				System.out.print("O maior n�mero informado �: "+ C);
			}
				
		
	}
	

}
