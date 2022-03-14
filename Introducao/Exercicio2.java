package IntroducaoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int anos, meses, dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira sua idade em dias: ");
		dias=ler.nextInt();
		
		anos=(dias/365);
		meses=(dias%365)/30;
		dias=(dias%365) %30;
		
		System.out.print("Você tem: "+ anos +" anos");
		System.out.print("\nVoce tem " + meses +" meses");
		System.out.print("\nVoce tem " + dias + " dias");
		

	}

}
