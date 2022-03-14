package Java.POO.OrientaçãoObjetos;

public class Cliente {

	String cor, compras, pagamento;
	int porta;
	double motor;
	boolean edicaoPadrao, parcelamento, portas;
	
	public void status() {

		if (this.edicaoPadrao == true)
			System.out.println("Ótima escolha, você vai conhecer o modelo 2023");
		else
			System.out.println("Perfeito! Você vai conhecer a potencia do modelo turbo 2023");

		System.out.println("Cor: " + this.cor);
		System.out.println("Motor escolhido " + this.motor);
		System.out.println("Modelo escolhido foi Padrão? " + edicaoPadrao);
		System.out.println("Quantidade de portas " + porta);
		System.out.println("Pagamento por parcelamento: " + parcelamento);

		if (parcelamento == true)
			System.out.println("Com uma entrada $ e parcelamento, você ganhou desconto em sua compra.");
		else
			System.out.println("Para comprar seu carro, haverá necessidade de financiar.");

		System.out.println("\n----------PROXIMO CLIENTE-----------\n");

	}

}
