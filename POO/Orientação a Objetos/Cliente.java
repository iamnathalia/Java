package IntroducaoPOO;
public class Cliente {
	
		String cor, porta, compras;
		double motor; 
		boolean edicaoPadrao, parcelamento, portas; 
		
		
		public Cliente ()
		{
			this.cor=" preto";
			this.motor= 1.5;
			this.porta=" 4";
		}
		
		public void Cliente2 ()
		{
			this.cor=" Branco";
			this.motor= 1.0;
			this.porta=" 2";		
		}
		
		public void Cliente3 ()
		{
			this.cor=" Vermelho";
			this.motor= 1.8;
			this.porta=" 4";
		}
		
		public void testdrive()  {	
			if (this.edicaoPadrao==true)
				System.out.println("�tima escolha, voc� vai conhecer o modelo 2023");
			else 
				System.out.println("Perfeito! Voc� vai conhecer a potencia do modelo turbo 2023");
			
		} 
		
		public void compras ()
		{
			if (this.parcelamento=true)
			System.out.println("Com uma entrada $ e parcelamento, voc� ganhou desconto em sua compra.");
			else 
			System.out.println("Para comprar seu carro, haver� necessidade de financiar.");
		}
		
		
		public void DuasPortas() // OLHAR BOOLEANO
		{
			this.portas=true;
		}
		public void quartoPortas() 
		{
			this.portas=false;
		}
		
		
		public void status () 
		{
			System.out.println("Cor:" + this.cor);
			System.out.println("Motor escolhido" + this.motor);
			System.out.println("Modelo escolhido foi Padr�o? " + edicaoPadrao);
			System.out.println("Quantidade de portas" + porta);
			System.out.println("Pagamento por parcelamento: " + parcelamento);
			System.out.println("----------PROXIMO CLIENTE-----------");

		}
		
}
