package JavaPOO.Heranca;

public class Atividade01 {

	public static void main(String[] args) {

		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica preg1 = new Preguica();

		dog1.setnomeAnimal("Pincher bravo");
		dog1.setidadeAnimal(2);
		dog1.setsomAnimal("Latindo nervoso au grrrrr au");
		dog1.setacaoAnimal("Correr");
		dog1.status();
		System.out.println("O movimento é " + dog1.getacaoAnimal());
		System.out.println("");
		
		horse1.setnomeAnimal("Pintado");
		horse1.setidadeAnimal(5);
		horse1.setsomAnimal("hiniiiiin");
		horse1.setacaoAnimal("Correr");
		horse1.status();
		System.out.println("O movimento é " + horse1.getacaoAnimal());
		System.out.println("");
		
		preg1.setnomeAnimal("Pregui");
		preg1.setidadeAnimal(7);
		preg1.setsomAnimal("uaaaaah");
		preg1.setacaoAnimal("Escalar Arvores");
		preg1.status();
		System.out.println("O movimento é " + preg1.getacaoAnimal());
	}

}
