package Java.Repeticoes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int x, num;
		int imp=0, par=0; 
		Scanner ler = new Scanner(System.in);
		
			for (x=1; x<=5; x++)
				{
					System.out.print("Digite um número: ");
					num=ler.nextInt();		
					
					
					if (num%2==0)
					{
						par++;	
					}
					
					else
					{
						imp++;	
					}	
					
				}
						System.out.print("\nNúmeros pares: " + par);
						System.out.print("\nNúmeros impares:" + imp);
	
	}

}


