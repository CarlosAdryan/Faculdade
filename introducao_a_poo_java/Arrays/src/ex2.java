import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] notes = new double[5];
		String[] names = new String[5];

		double average = 0;
		double approvalmedium = 6.0;
		double sumtotal = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your name: ");
			names[i] = sc.nextLine();
			System.out.print("Enter you note: ");
			notes[i] = sc.nextDouble();
			sc.nextLine();

			sumtotal += notes[i];
		}
		average = sumtotal / 5;

		System.out.printf("Class media: %.2f \n", average);

		System.out.println("approved students: ");
		for (int i = 0; i < 5; i++) {
			if (notes[i] >= approvalmedium) {
				System.out.println(names[i]);
			}
		}

		sc.close();

	}

}
