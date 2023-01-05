package bytebank;

public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente felipe = new Cliente();
		//conta.titular = felipe;
		
		conta.setTitular(felipe);
		felipe.setNome("Felipe Pereira Sarmento");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
	}
}
