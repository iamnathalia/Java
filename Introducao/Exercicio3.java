package IntroducaoJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int seg, min, hrs;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos seguntos o evento durou? ");
		seg= ler.nextInt();
		
		hrs= (seg/3600);
		min= (seg%3600)/60;
		seg= (seg%3600)%60;
		
		System.out.println("O evento durou "+hrs+" horas "+ min+" minutos " + seg + " segundos");
		
		
				
		

		
		
		
		
		
	}

}
