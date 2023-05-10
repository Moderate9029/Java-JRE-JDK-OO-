package uscs;

public class PortaTeste {

	public static void main(String[] args) {
		
		Porta p1 = new Porta(0.80, 1.90, "Azul");
		
		System.out.println(p1.calculaArea());
		System.out.println(p1.calculaPerimetro());
		System.out.println(p1.toString());
		System.out.println(p1.calculaQuantidadeVerniz(7));
	}
}
