package Java.POO.Orienta��oObjetos;

public class Cliente {

	String cor, compras, pagamento;
	int porta;
	double motor;
	boolean edicaoPadrao, parcelamento, portas;
	
	public void status() {

		if (this.edicaoPadrao == true)
			System.out.println("�tima escolha, voc� vai conhecer o modelo 2023");
		else
			System.out.println("Perfeito! Voc� vai conhecer a potencia do modelo turbo 2023");

		System.out.println("Cor: " + this.cor);
		System.out.println("Motor escolhido " + this.motor);
		System.out.println("Modelo escolhido foi Padr�o? " + edicaoPadrao);
		System.out.println("Quantidade de portas " + porta);
		System.out.println("Pagamento por parcelamento: " + parcelamento);

		if (parcelamento == true)
			System.out.println("Com uma entrada $ e parcelamento, voc� ganhou desconto em sua compra.");
		else
			System.out.println("Para comprar seu carro, haver� necessidade de financiar.");

		System.out.println("\n----------PROXIMO CLIENTE-----------\n");

	}

}
