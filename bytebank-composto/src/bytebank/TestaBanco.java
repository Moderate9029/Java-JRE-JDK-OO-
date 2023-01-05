package bytebank;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Pereira Sarmento";
		felipe.cpf = "999.999.999.99";
		felipe.profissao = "Programador";
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		
		contaDoFelipe.titular = felipe;
		System.out.println(contaDoFelipe.titular.nome);
	}
}
