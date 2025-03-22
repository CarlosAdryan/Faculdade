package application;

public class Program {
		
		static int somar(int x, int y) {
			int resultado = x+y;
			return resultado;
		}
		
	
		public static void main(String[] args) {
			
			int recebeSoma;
			
			recebeSoma = somar(10, 5);
			System.out.println("Soma: " + recebeSoma);
			
			
		}

	}
