import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// criando um array indiretamente
		int[] num = new int[3];
		// chamando o scanner
		Scanner sc = new Scanner(System.in);		
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("Digite o numero da posição: " + i);
			num[i] = sc.nextInt();	
		}
		
		int bigger = num[0];
		
		// usando um for para percorrer
		for (int i = 0; i <= 2; i++) {
			// quando meu i = 0 | primeira inicialização
			if(i==0){
				bigger = num[i];
			} 
			else if (bigger < num[i]) { // i != 0 - outras...
				// atribuo o numero da rodada ao meu aux  
				bigger = num[i];
			}
		}
		
		System.out.println("O maior numero é: " + bigger);
		
		sc.close();

	}

}
