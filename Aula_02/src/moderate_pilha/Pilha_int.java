package moderate_pilha;

public class Pilha_int {

	// Propriedades
	int[] pilha;
	int topo;
	int capacidade;
	
	public Pilha_int(int tamanho){
		topo = -1;
		capacidade = tamanho;
		pilha = new int[capacidade];
	}
	
	public void Push(int n) {
		if(Cheia() == false) {
			topo++;
			pilha[topo] = n;
			System.out.println("Foi empilhado o número " + n);
		}else {
			System.out.println("Não foi póssivel empilhar o número " + n);
		}
	}
	
	public boolean Vazia() {
		return (topo == -1);
	}
	
	public boolean Cheia() {
		return (topo+1 == capacidade);
	}
	
	public int Pop() {
		if(Vazia() == false) {
			topo--;
			return pilha[topo+1];
		}
		return 0;
	}
	
	public void Imprime_Pilha() {
		if(Vazia() == true) {
			System.out.println("A pilha está Vazia!!!");
		}else {
			System.out.println("/////////////////");
			for (int i = 0; i <= topo; i++) {
				System.out.println("||" + pilha[i]);
			}
		}
	}
	
	public void Top() {
		if(Vazia() == true) {
			System.out.println("A Pilha está Vazia...");
		}else {
			System.out.println("O topo da pilha");
			System.out.println("||" + pilha[topo]);
		}
	}
	
	public void Resto_Pilha() {
		if(Cheia() == true) {
			System.out.println("A pilha está cheia");
		}else {
			System.out.println("Ainda resta " + (capacidade - (topo+1)) + " de espaço na pilha.");
		}
	}
	
}
