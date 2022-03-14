package Java.POO;

public class AulaCont {

	private String titulo;
	private int tempo;

	public AulaCont (String x, int n)
	{
		this.titulo=x;
		this.tempo=n;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String toString() {
		return "Aulas:" + this.titulo + ", " + this.tempo + " min";
	}

}
