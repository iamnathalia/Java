package Java.POO.OrientaçãoObjetos;

public class Aviao {

	String modelo, decolar, liga, codigoAviao, capNome;
	boolean aDecolar, celularDesligado, cinto;

	public void status() {

		if (aDecolar==true)
			System.out.println("Comunicação Avião <> Comando de Vôos: \nCentral, aqui é a " + capNome
					+ " falando da aeronave " + modelo + " código " + codigoAviao
					+ " confirmando a autorização da decolagem. " + "\nIniciando motores e turbinas.");

		else
			System.out.println("Comunicação Avião <> Comando de Vôos: \nCentral, aqui é a Capitã " + capNome
					+ " comunicando da Aeronave " + modelo + " código " + codigoAviao
					+ " solicito autorização para decolagem");
	

		System.out.println("\nModelo do avião " + modelo);
		System.out.println("O código do aviao na lista de decolagem é " + codigoAviao);
		System.out.println("Autorização para decolagem " + aDecolar + "\n");

		if ((celularDesligado == true) && (cinto == true))
			System.out.println(
					"Comunicação Avião >> Passageiros: \nÓtimo. Atenção passageiros, podemos iniciar a decolagem! "
					+ "Solicitamos que mantenham o cinto travado e o celular no modo avião.");

		else
			System.out.println(
					"Comunicação Avião >> Passageiros: \nAtenção passageiros, lembrando que para uma decolagem segura "
					+ "solicitamos o uso do cinto e conferencia do celular em modo avião.");

		System.out.println("\n---------- MONITORAMENTO CONTINUO - CENTRAL DE VÔOS  -----------\n");

	}
}
