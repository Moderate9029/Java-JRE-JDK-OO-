package alura;

public class MultiplosDe3 {

	public static void main(String[] args) {
		
		System.out.println("Multiplos de 3");
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		/* Outra maneira
		 * for(int i = 3; i <= 100; i+=3){
		 * 		System.out.println(i);
		 * }
		 * 
		*/
	}
}
