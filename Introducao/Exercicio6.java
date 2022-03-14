package IntroducaoJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, dist, a1, b2, a4, b4, base;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe os dados de entrada do eixo X: ");
		x1= ler.nextDouble();
		
		System.out.print("\nInforme os dados de entrada do eixo Y: ");
		y1= ler.nextDouble();
		
		System.out.print("\nInforme os dados de saida do eixo X: ");
		x2= ler.nextDouble();
		
		System.out.print("\nInforme os dados de saida do eixo Y: ");
		y2= ler.nextDouble();
		
		a1 = x1 - x2;
		b2 = y1 - y2;
		a4 = a1 * a1;
		b4 = b2 * b2;
		base = a4 + b4;
		dist = (float) Math.sqrt(base);

		System.out.print("\nA distancia entre os pontos é: "+dist);
		
		
		
		
		
		
		
		
		

	}

}
