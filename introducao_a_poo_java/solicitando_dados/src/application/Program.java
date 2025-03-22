package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String name = sc.nextLine();
		System.out.println("Digite sua idade");
		int age = sc.nextInt();
		System.out.println("Digite sua altura");
		double height = sc.nextDouble();
		System.out.println("Digite sua cidade");
		sc.nextLine();
		String city = sc.nextLine();
		
		System.out.println("Seu nome:" + name + " tem " + age + " anos e tem " +height + " de altura " + "e mora em "+ city);
		
		sc.close();

	}

}
