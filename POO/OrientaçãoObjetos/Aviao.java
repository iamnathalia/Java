package Java.POO.Orienta��oObjetos;

public class Aviao {

	String modelo, decolar, liga, codigoAviao, capNome;
	boolean aDecolar, celularDesligado, cinto;

	public void status() {

		if (aDecolar==true)
			System.out.println("Comunica��o Avi�o <> Comando de V�os: \nCentral, aqui � a " + capNome
					+ " falando da aeronave " + modelo + " c�digo " + codigoAviao
					+ " confirmando a autoriza��o da decolagem. " + "\nIniciando motores e turbinas.");

		else
			System.out.println("Comunica��o Avi�o <> Comando de V�os: \nCentral, aqui � a Capit� " + capNome
					+ " comunicando da Aeronave " + modelo + " c�digo " + codigoAviao
					+ " solicito autoriza��o para decolagem");
	

		System.out.println("\nModelo do avi�o " + modelo);
		System.out.println("O c�digo do aviao na lista de decolagem � " + codigoAviao);
		System.out.println("Autoriza��o para decolagem " + aDecolar + "\n");

		if ((celularDesligado == true) && (cinto == true))
			System.out.println(
					"Comunica��o Avi�o >> Passageiros: \n�timo. Aten��o passageiros, podemos iniciar a decolagem! "
					+ "Solicitamos que mantenham o cinto travado e o celular no modo avi�o.");

		else
			System.out.println(
					"Comunica��o Avi�o >> Passageiros: \nAten��o passageiros, lembrando que para uma decolagem segura "
					+ "solicitamos o uso do cinto e conferencia do celular em modo avi�o.");

		System.out.println("\n---------- MONITORAMENTO CONTINUO - CENTRAL DE V�OS  -----------\n");

	}
}
