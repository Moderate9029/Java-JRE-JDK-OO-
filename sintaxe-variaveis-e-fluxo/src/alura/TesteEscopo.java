package alura;

public class TesteEscopo {
	
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!!!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}
