package IntroducaoJava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
	
	double vFab, dist, imp, cc; 
	Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor de fabrica do carro: ");
		vFab = ler.nextDouble();
		
		dist=vFab*0.28;
		imp=vFab*0.45;
		cc=vFab+dist+imp;
		
		System.out.print("\nO valor do carro para venda é de: "+ cc);
		
	
	}
	

}
