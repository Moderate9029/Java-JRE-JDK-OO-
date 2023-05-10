package uscs;

public class EnderecoTeste {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco("Rua Vars", 61, "Casa 2", "São Caetano do Sul", "SP", "09060920", "Brasil");
		
		String extenso = e1.obtemEstadoPorExtenso();
		System.out.println(extenso);
		System.out.println(e1.toString());
	}
}
