package Java.POO.OrientaçãoObjetos;

public class Aviao2 {

	public static void main(String[] args) {

		Aviao Aeronave1 = new Aviao();

		Aeronave1.aDecolar = false;
		Aeronave1.celularDesligado = false;
		Aeronave1.cinto = false;
		Aeronave1.codigoAviao = "ART567";
		Aeronave1.modelo = "BOING4500";
		Aeronave1.capNome = "Fernanda";
		

		Aeronave1.status();

	}
}
