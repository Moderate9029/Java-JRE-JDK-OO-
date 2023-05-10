package moderate;

public class Atividade_02 {

	public static void main(String[] args) {
		
		int[]par = new int[50];
		
		for (int i = 0; i < par.length; i++) {
			par[i] = (int) (100.0 * Math.random());
			System.out.println(par[i]);
		}
		
	}
	
}
