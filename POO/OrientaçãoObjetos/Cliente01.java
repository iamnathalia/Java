package Java.POO.OrientaçãoObjetos;

public class Cliente01 {

	public static void main(String[] args) {

		Cliente Carro1 = new Cliente();
		Cliente Carro2 = new Cliente();
		Cliente Carro3 = new Cliente();

		Carro1.cor = "Vermelho";
		Carro1.edicaoPadrao = true;
		Carro1.parcelamento = true;
		Carro1.motor = 1.5;

		Carro2.cor = "Azul";
		Carro2.edicaoPadrao = false;
		Carro2.parcelamento = true;
		Carro2.motor = 1.8;

		Carro3.cor = "Branco";
		Carro3.edicaoPadrao = true;
		Carro3.parcelamento = false;
		Carro3.motor = 1.0;
		Carro3.porta = 2;
		
		Carro1.status();
		Carro2.status();
		Carro3.status();

	}

}
