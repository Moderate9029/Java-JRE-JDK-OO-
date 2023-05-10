package moderate;

public class MergeSort {

	public static int[] vetor = {8,3,2,9,7,1,5,4};

	static int n = vetor.length;

	public static void main(String[] args) {

		Sort(0,n-1);
		for (int i=0;i<n;i++ )

		System.out.println("vetor[" + i + "] = " + vetor[i]);
	}
	
	public static void Sort(int inicio, int fim) {

		if (inicio < fim) {

		int meio = (inicio + fim) / 2;

		Sort(inicio, meio);
		Sort(meio + 1, fim);
		Merge(inicio, meio, fim);

		}

	}
	
	public static void Merge(int inicio, int meio, int fim) {

		int n = fim - inicio + 1;

		int[] temp = new int[n];
		int tamanho = temp.length;

		for (int posicao = 0; posicao < tamanho; posicao++) {

		temp[posicao] = vetor[inicio + posicao];

		}
	}
	
}
