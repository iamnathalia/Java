package Java.Repeticoes;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String [] args) {
		int idade, genero, emocional, totalP=1, pCalma=0, mNervosa=0, hAgressivo=0, outPCalmas=0, pCalmaJovem=0, pNervosaAdulta=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Olá, informe sua idade: ");
		idade = ler.nextInt();
		System.out.println("Informe seu gênero? \n1-Feminino \n2-Masculino \n3-Outros");
		genero = ler.nextInt();
		System.out.println("Como você se sente hoje? \n1-Calmo(a); \n2-Nervosa; \n3-Agressivo");
		emocional = ler.nextInt();
		System.out.println("\n--------PROXIMA PESSOA---------\n");
		
			while(totalP <150)
			{
				
				if (emocional==2 && genero==1) 
					{
						mNervosa++;
					}
				if (emocional==3 && genero==2) 
					{
						hAgressivo++;
					}
				if (emocional==1) 
					{
						pCalma++;
					}
				if (emocional==1 && genero==3) 
					{
						outPCalmas++;
					}
				if (emocional==2 && idade >40) 
					{
						pNervosaAdulta++;
					}
				if (emocional==1 && idade <18) 
					{
						pCalmaJovem++;
					}	
				
				System.out.println("Qual sua idade? ");
				idade = ler.nextInt();
				System.out.println("Informe seu gênero? \n1-Feminino \n2-Masculino \n3-Outros");
				genero = ler.nextInt();
				System.out.println("Como você se sente hoje? \n1-Calmo(a); \n2-Nervosa; \n3-Agressivo");
				emocional = ler.nextInt();
				totalP++;
			}
			
			System.out.println("Quantidade de pessoas nervosas acima de 40 anos é: " + pNervosaAdulta + 
					"e a quantidade de pessoas calmas abaixo dos 18 anos é: \" + pCalmaJovem");
			
			
			System.out.println("O número de mulheres nervosas é: " + mNervosa);
			System.out.println("O número de homens agressivos é: " + hAgressivo);
			System.out.println("O número de pessoas calmas é: " + pCalma);
			System.out.println("O número de outres calmos é: " + outPCalmas);
		
	}

		
}


