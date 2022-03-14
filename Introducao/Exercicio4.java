package IntroducaoJava;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int A, B, C, D, X, Y;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o numero A: ");
		A = ler.nextInt();
		System.out.print("Insira o numero B: ");
		B = ler.nextInt();
		System.out.print("Insira o numero C: ");
		C= ler.nextInt();
		
		X= A+B^2; 
		Y= B+C^2;
		D= ((X+Y)/2);
		
		System.out.println("\nO resultado: "+ D );
		

	}

}
