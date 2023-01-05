package bytebank;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24226);
		Conta conta1 = new Conta(1337,24226);
		Conta conta2 = new Conta(1337,24226);
		Conta conta3 = new Conta(1337,24226);
		
		//conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-250);
		
		System.out.println(Conta.getTotal());
	}
}
