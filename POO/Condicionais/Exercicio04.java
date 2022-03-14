package atividadesJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float num, rz, pt;
			
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite um número: ");
			num=ler.nextInt();
			
				if (num%2==0)
					
					{
						rz = (float) Math.sqrt(num);
						
						System.out.println("O numero indicado é par! E sua raiz quadrada é " + rz);
					}
			
				if (num%2>0)
					
					{
						pt = (float) Math.pow(num, 2);
						System.out.println("O numero indicado é impar! E na potência elevado a 2 é "+ num);
					}
					
				if (num==0)
					
					{
						pt = (float) Math.pow(num, 2);
						System.out.println("O número indicado é par, porém é zero!");
					}
	}

}
