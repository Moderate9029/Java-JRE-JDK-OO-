package moderate_pilha;

public class Teste_pilhaString {
	
	public static void main(String[] args) {
		Pilha_string ps1 = new Pilha_string(10);
		
		ps1.push("São Paulo");
		ps1.push("Corinthians");
		ps1.push("Palmeiras");
		ps1.imprime_Pilha();
		ps1.pop();
		ps1.imprime_Pilha();
		ps1.imprime_array(ps1.gera_Array());
	}
}
