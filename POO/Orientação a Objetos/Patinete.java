package JavaPOO.IntroducaoPOO;

public class Patinete {

	String modeloPat = "Eletronico";
	int integra��oGPS = 10, quantidadeModelo = 20;
	boolean condi��o;

	public void novo() {
		condi��o = false;
	}

	public void prote��o() {
		if (condi��o == true) {
			System.out.println("Parab�ns, patinete com trava de seguran�a integrada");
		} else {
			System.out.println("Aten��o, este patinete n�o possui alarme integrado");
		}
	}

	public void status() {
		System.out.println("O modelo �: " + modeloPat);
		System.out.println("Quantidade de modelos com integra��o GPS: " + integra��oGPS);
		System.out.println("Disponibilidade de modelos eletricos e n�o eletricos para venda: " + quantidadeModelo);
	}

}
