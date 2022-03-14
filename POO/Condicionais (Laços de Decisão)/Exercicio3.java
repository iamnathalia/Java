package atividadesJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade; 
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite sua idade: ");
			idade=ler.nextInt();
			
				if (idade>=10 && idade<=14)
				{
					System.out.print("Você está incluso na categoria INFANTIL");
				}
				
				if (idade>=15 && idade<=17)
				{
					System.out.print("Você está incluso na categoria JUVENIL");
				} 
				
				if (idade>=18)
				{
					System.out.print("Você está incluso na categoria ADULTO");
				}
					

	}

}


