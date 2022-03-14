package POO.Heranca;

public class Preguica extends Animals {

	
	private String acaoAnimal;

	public String getacaoAnimal() {
		return acaoAnimal;
	}

	public void setacaoAnimal(String acaoAnimal) {
		this.acaoAnimal = acaoAnimal;
	}
	
	public static void main(String[] args) {
		Preguica preg1 = new Preguica();

		preg1.somDog1();

	}
	
	
}
