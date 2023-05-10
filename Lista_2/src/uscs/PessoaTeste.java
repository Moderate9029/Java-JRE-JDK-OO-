package uscs;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jeferson", "Pinto", "24", "10", "2003", "40028922", "jefinho.pinto@gmail.com");
		
		System.out.println(p1.toString());
		System.out.println(p1.geraUsuario());
		System.out.println(p1.geraSenha());
		System.out.println(p1.calculaIdade(8, 4, 2023));
		System.out.println(p1.validaEleitor(8, 4, 2023));
	}
}
