package POO.Heranca;

public class Cachorro extends FormSom {

	private String acaoAnimal;

	public String getacaoAnimal() {
		return acaoAnimal;
	}

	public void setacaoAnimal(String acaoAnimal) {
		this.acaoAnimal = acaoAnimal;
	}

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro();

		dog1.somDog1();

	}

}
