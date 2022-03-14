package JavaPOO.Heranca;

public abstract class Animals {

	private String nomeAnimal, somAnimal;
	private int idadeAnimal;

	public String getnomeAnimal() {
		return nomeAnimal;
	}

	public void setnomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	
	public int getidadeAnimal() {
		return idadeAnimal;
	}

	public void setidadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public String getsomAnimal() {
		return somAnimal;
	}

	public void setsomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}

	public void status() {
		System.out.println("Nome :" + this.nomeAnimal);
		System.out.println("Idade: " + this.idadeAnimal + " anos");
		System.out.println("Som " + this.somAnimal);
	
	}

	public void somDog1() {
			
	}

	public void somHorse1() {
			
	}

	public void somPreg1() {
	
		
	}

}

