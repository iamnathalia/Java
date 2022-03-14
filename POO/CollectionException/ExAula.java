package Java.POO;

import java.util.ArrayList;

public class ExAula {

	public static void main(String[] args) {

		ExAula a1 = new ExAula("laços", 40);
		ExAula a2 = new ExAula("POO", 90);
		ExAula a3 = new ExAula("Herança", 60);

		ArrayList<ExAula> curso = new ArrayList<>();

		System.out.println(curso);

		curso.add(a1);
		curso.add(a2);
		curso.add(a3);

		System.out.println(curso);

	}

}