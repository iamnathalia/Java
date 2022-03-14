package IntroducaoJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media1, media2, media3, mediaFinal;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira sua 1a nota: ");
		nota1= ler.nextInt();
		System.out.print("Insira sua 2a nota: ");
		nota2= ler.nextInt();
		System.out.print("Insira sua 3a nota: ");
		nota3= ler.nextInt();
		
		media1=(nota1*2.3);
		media2=(nota2*5);
		media3=(nota3*5);
		mediaFinal=((media1+media2+media3)/12.5);
		
		System.out.print("Sua média final é: "+mediaFinal+("!") );
				
		
		

	}

}
