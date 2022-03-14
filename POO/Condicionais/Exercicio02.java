package atividadesJava;

import java.util.Scanner;

public class Exercicio02 {
	
		public static void main(String [] args) {
		int xa, xb, xc;
		
		Scanner ler = new Scanner (System.in);
		
			System.out.print("Digite um número: ");
			xa=ler.nextInt();
			System.out.print("Digite um número: ");
			xb=ler.nextInt();
			System.out.print("Digite um número: ");
			xc=ler.nextInt();
		
			
				if ((xa<xb) && (xb<xc))
				{
					System.out.printf("Números apresentados: %d, %d, %d ", xa, xb, xc);
				}
			
				if ((xa<xc) && (xc<xb))
				{
					System.out.printf("Números apresentados: %d, %d, %d ", xa, xc, xb);
				}
				
				if ((xb<xa) && (xa<xc))
				{
					System.out.printf("Números apresentados: %d, %d, %d ", xb, xa, xc);
				}
				
				if ((xb<xc) && (xc<xa))
				{
					System.out.printf("Números apresentados: %d, %d, %d ", xb, xc, xa);
				}
				
				if ((xc<xa) && (xc<xb))
				{
					System.out.printf("Números apresentados: %d, %d, %d ", xc, xa, xb);
				}
				
				if ((xb<xa) && (xa<xc))
				{
					System.out.printf("Números apresentados: ", + xb, xa, xc);
				}
				
				if ((xc<xb) && (xb<xa))
				{
					System.out.printf("Números apresentados: " + xc, xb, xa);
				}
				
		}

}
