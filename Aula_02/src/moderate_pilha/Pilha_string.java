package moderate_pilha;

public class Pilha_string {
	
	int capacidade;
	String[] pilha;
	int topo;
	
 	public Pilha_string(int tamanho) {
		topo = -1;
		capacidade = tamanho;
		pilha = new String[capacidade];
	}
 	
 	public boolean vazia() {
 		return (topo == -1);
 	}
 	
 	public boolean cheia() {
 		return (topo+1 == capacidade);
 	}
 	
 	public void push(String s) {
 		if(cheia() == false) {
 			topo++;
 			pilha[topo] = s;
 			System.out.println("A palavra empilhada foi " + s);
 		}else {
 			System.out.println("A pilha está Cheia!!!");
 		}
 	}
 	
 	public String pop() {
 		if(vazia() == false) {
 			topo--;
 			return (pilha[topo+1]);
 		}
 		return "ERROR";
 	}
 	
 	public void imprime_Pilha() {
 		if(vazia() == false) {
 			System.out.println("///////////////////");
 			for (int i = 0; i <= topo; i++) {
				System.out.println("// " + pilha[i]);
			}
 		}else {
 			System.out.println("A Pilha esta Vazia...");
 		}
 	}
 	
 	public String[] gera_Array() {
 		String[] new_array;
 		new_array = new String[capacidade];
 		
 		if(vazia() == false) {
	 		int j = 0;
	 		for (int i = 0; i <= topo; i++) {
				new_array[j] = pilha[i];
				j++;
			}
	 		return new_array;
 		}else
 			return (new_array);
 	}
 	
 	public boolean array_empty(String[] v_array) {
 		int x = 0;
 		for (int i = 0; i < capacidade; i++) {
			if(v_array[i] == null) {}
			else x++;
		}
 		if(x > 0)
 			return false;
 		else
 			return true;
 	}
 	
 	public void imprime_array(String[] prn_array){
 		// Com meus metodos
 		/*
 		 if(array_empty(prn_array) == true) {
 			System.out.println("Array vazio...");
 		}else {
 			for (int i = 0; i < prn_array.length; i++) {
 				if(prn_array[i] != null) {
 					System.out.println("'"+ prn_array[i] + "'");
 				}
			}
 		}
 		*/
 		
 		// Usando .lenght
 		if(prn_array.length != 0) {
 			for (int i = 0; i < prn_array.length; i++) {
 				if(prn_array[i] != null) {
 					System.out.println("'"+ prn_array[i] + "'");
 				}
			}
 		}else
 			System.out.println("Array vazio...");
 	}
 	
 	public int qtde_Valores_Pilha() {
 		if(vazia() == false) {
 			return topo++;
 		}else
 			return 0;
 	}
 	
 	public boolean search_Topo(String search) {
 		if(vazia() == true)
 			return false;
 		else if(pilha[topo] == search)
 				return true;
 		else
 			return false;
 	}
 	
}
