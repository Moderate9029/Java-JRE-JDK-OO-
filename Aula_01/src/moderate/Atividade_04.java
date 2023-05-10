package moderate;

public class Atividade_04 {

	public static void main(String[] args) {
		String[] equipes = {
				"Santos", "Corinthians",
				"São Paulo", "Portuguesa",
				"Palmeiras", "São Caetano"
		};
		
		System.out.println("Seu time favorito de hoje = " + 
		equipes [(int) (equipes.length * Math.random())] );
		/* - Math.random() ele randomicamente pega um número entre
		 * 0 e 1 
		 * - Eler ira multiplicadar o número que ele puxou e 
		 * multiplicara pelo tamanho do meu array
		*/
	}
}
