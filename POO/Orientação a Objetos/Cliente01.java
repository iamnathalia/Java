package JavaPOO.IntroducaoPOO;

public class Cliente01 {
	
	public static void main(String[] args) {
		
		Cliente Carro1 = new Cliente ();
		Cliente Carro2 = new Cliente ();
		Cliente Carro3 = new Cliente ();
		
		Carro1.cor = "Vermelho";
		Carro1.edicaoPadrao=true;
		Carro1.parcelamento=true;
		
		
		Carro2.cor = "Azul";
		Carro2.edicaoPadrao=false;
		Carro2.parcelamento=true;
		
		Carro3.cor = "Branco";
		Carro3.edicaoPadrao=true;
		Carro3.parcelamento=false;
		
		
		Carro1.status();
		Carro2.status();
		Carro3.status();
		
	}
	
}

