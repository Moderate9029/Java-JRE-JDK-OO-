package moderate_pilha;

public class Teste_pilhaInt {

	public static void main(String[] args) {
		Pilha_int p1 = new Pilha_int(50);
		
		p1.Push(5);
		p1.Push(10);
		p1.Push(8);
		p1.Imprime_Pilha();
		p1.Pop();
		p1.Imprime_Pilha();
		p1.Top();
		p1.Resto_Pilha();
	}
}
