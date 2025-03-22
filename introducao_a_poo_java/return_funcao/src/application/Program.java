package application;

public class Program {
	// definir função - que indique o maior numero

	static int maiorNumero(int x, int y) {
		int maior = 0;
		if (x > y) { // x maior que y
			return x;
		} else if (y > x){ // y maior que x
			return y;
		} else { // x == y - ERROR
			return 0;
		}
	}
	
	// Chamada
	
	public static void main(String[] args) {
		
		int maior;
		
		maior = maiorNumero(5, 10);
		System.out.println(maior);
		
	}

}
