package atividadesJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float num, rz, pt;
			
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite um n�mero: ");
			num=ler.nextInt();
			
				if (num%2==0)
					
					{
						rz = (float) Math.sqrt(num);
						
						System.out.println("O numero indicado � par! E sua raiz quadrada � " + rz);
					}
			
				if (num%2>0)
					
					{
						pt = (float) Math.pow(num, 2);
						System.out.println("O numero indicado � impar! E na pot�ncia elevado a 2 � "+ num);
					}
					
				if (num==0)
					
					{
						pt = (float) Math.pow(num, 2);
						System.out.println("O n�mero indicado � par, por�m � zero!");
					}
	}

}
