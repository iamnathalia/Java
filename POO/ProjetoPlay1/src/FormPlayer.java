
public class FormPlayer {
	

	public class FormPlayer implements Player {

		private int iniciar = 0;
		
		@Override
		public void iniciar() { // Polimorfismo

			System.out.println("\n⏮ ▶️ ⏸️ ⏹️ ⏭️");
		
		}

		public int getIniciar() { //Encapsulamento 
			return iniciar;
		}

		public void setIniciar(int iniciar) {
			this.iniciar = iniciar;
		}

	}
}
