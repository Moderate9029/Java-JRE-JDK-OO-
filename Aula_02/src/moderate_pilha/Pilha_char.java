package moderate_pilha;

public class Pilha_char {

	public Character[] pilha; 	// data - Character
	public int topo;			//
	public int capacidade;
	
	public Pilha_char(int tamanho) {
		topo = -1;
		this.capacidade = tamanho;
		pilha = new Character[this.capacidade];
	}
	
	public boolean vazia() {
		return (this.topo == -1);
	}
	
	public boolean cheia() {
		return (this.topo+1 == this.capacidade);
	}
	
	public void push(Character c) {
		if(cheia() == false) {
			topo++;
			pilha[topo] = c;
			System.out.println("Foi empilhado: " + c);
		}else {
			System.out.println("A pilha está Cheia...");
		}
	}
	
	public Character pop() {
		if(vazia() == false) {
			this.topo--;
			return (pilha[topo+1]);
		}else
			return 'F';
	}
	
	public void imprime_Pilha() {
		System.out.println("///////////////////");
		if(vazia() == false) {
			for (int i = 0; i <= topo; i++) {
				System.out.println("||" + pilha[i]);
			}
		}else {
			System.out.println("A pilha esta Vazia...");
		}
	}
	
	public void clear() {
		if(vazia() == false) {
			this.topo = -1;
			System.out.println("A pilha foi resetada.");
		}else
			System.out.println("A pilha já está vazia...");
	}
	
	/*public void empilha_Char() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite alguma coisa:");
		String c = in.nextLine();
		
		in.close();
		
	}*/
}
