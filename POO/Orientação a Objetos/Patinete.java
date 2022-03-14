package JavaPOO.IntroducaoPOO;

public class Patinete {

	String modeloPat = "Eletronico";
	int integraçãoGPS = 10, quantidadeModelo = 20;
	boolean condição;

	public void novo() {
		condição = false;
	}

	public void proteção() {
		if (condição == true) {
			System.out.println("Parabéns, patinete com trava de segurança integrada");
		} else {
			System.out.println("Atenção, este patinete não possui alarme integrado");
		}
	}

	public void status() {
		System.out.println("O modelo é: " + modeloPat);
		System.out.println("Quantidade de modelos com integração GPS: " + integraçãoGPS);
		System.out.println("Disponibilidade de modelos eletricos e não eletricos para venda: " + quantidadeModelo);
	}

}
