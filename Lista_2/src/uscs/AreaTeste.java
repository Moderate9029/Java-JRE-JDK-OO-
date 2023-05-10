package uscs;

public class AreaTeste {

	public static void main(String[] args) {
		
		Parede p1 = new Parede(1.9, 0.8, "Vermelha");
		
		System.out.println(p1.calculaArea());
		System.out.println(p1.calculaPerimetro());
		System.out.println(p1.calculaQuantidadeAzulejos(0.1, 0.1));
		System.out.println(p1.calculaQuantidadeTinta(7));
	}
}
