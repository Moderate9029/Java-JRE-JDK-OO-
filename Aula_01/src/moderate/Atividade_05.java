package moderate;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = in.nextLine();
		
		System.out.println("Quantos anos você tem?");
		int idade = in.nextInt();
		
		System.out.println("Olá " + nome + "," + "você tem " + idade +
				"anos...");
		in.close();
		
	}
	
}
