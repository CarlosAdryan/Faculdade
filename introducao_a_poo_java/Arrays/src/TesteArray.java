
public class TesteArray {

	public static void main(String[] args) {

		// uma direta
		int[] num = { 7, 8, 9 };
		// criando de forma indireta
		int[] numDois = new int[3];
		numDois[0] = 7;
		numDois[1] = 8;
		numDois[2] = 9;

		System.out.println("Forma 1: " + num[0]);
		System.out.println("Forma 2: " + num[0]);
		
		String[] nomes = new String[3];
		nomes[0] = "Lucas";
		System.out.println(nomes[0]);	
	}
}
