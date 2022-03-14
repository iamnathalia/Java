package POO.Heranca;

public class Cavalo extends Animals {

	private String acaoAnimal;
	
	public String getacaoAnimal() {
		return acaoAnimal;
	}

	public void setacaoAnimal(String acaoAnimal) {
		this.acaoAnimal = acaoAnimal;
	}

	public static void main(String[] args) {
		Cavalo horse1 = new Cavalo();

		horse1.somDog1();
	}
	
}


