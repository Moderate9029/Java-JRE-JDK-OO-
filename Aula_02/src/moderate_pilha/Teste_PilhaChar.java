package moderate_pilha;

public class Teste_PilhaChar {

	public static void main(String[] args) {
		Pilha_char c = new Pilha_char(10);
		
		c.push('a');
		c.push('#');
		c.push('@');
		c.imprime_Pilha();
		c.pop();
		c.imprime_Pilha();
		
	}
}
