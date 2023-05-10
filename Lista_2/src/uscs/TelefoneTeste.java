package uscs;

public class TelefoneTeste {

	public static void main(String[] args) {
		Telefone t1 = new Telefone("67009875", 11, 55, "Telefone Celular");
		Telefone t2 = new Telefone("67009875", 11, 77, "Telefone Fixo");
		
		System.out.println(t1.toString());
		System.out.println(t1.verificaLigacaoNacional());
		System.out.println(t2.toString());
		System.out.println(t2.verificaLigacaoNacional());
	}
	
}
