package IntroducaoJava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
	
		double a,b,c,d,e,f,x,y;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe os valor de A: ");
		a= ler.nextDouble();
		System.out.print("Informe os valor de B: ");
		b= ler.nextDouble();
		System.out.print("Informe os valor de C: ");
		c= ler.nextDouble();
		System.out.print("Informe os valor de D: ");
		d= ler.nextDouble();
		System.out.print("Informe os valor de E: ");
		e= ler.nextDouble();
		System.out.print("Informe os valor de F: ");
		f= ler.nextDouble();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.print("X e Y são respectivamente: " + x + y);
		
	}	
		
}
