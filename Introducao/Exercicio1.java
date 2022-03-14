package IntroducaoJava;

import java.util.Scanner;

public class Exercicio1 {
	
	

	public static void main(String[] args) {
		int idade, meses, dias; 
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite sua idade em anos: ");
		idade=ler.nextInt();
		
		
		dias=idade*365;
		meses=idade*12;
		
		
		System.out.println("Sua idade em dias é de: " + dias + " dias");
			

	}


}


