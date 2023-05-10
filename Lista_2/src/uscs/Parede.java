package uscs;

public class Parede {

	private double largura;
	private double altura;
	private String cor;
	
	public Parede(double largura, double altura, String cor) {
		this.largura = largura;
		this.altura = altura;
		this.cor = cor;
	}
	
	public Parede() {
		this.largura = 0.0;
		this.altura = 0.0;
		this.cor = "";
	}
	
	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public String getCor() {
		return cor;
	}
	
	public double calculaArea() {
		return(getAltura() * getLargura());
	}
	
	public double calculaPerimetro() {
		return((getAltura()*2)+ (getLargura()*2));
	}
	
	public double calculaQuantidadeTinta(int rendimento) {
		double rende =  (calculaArea() / rendimento);
		return rende;
	}
	
	public int calculaQuantidadeAzulejos(double lAz, double aAz) {
		int area = (int) (lAz * aAz);
		int q = (int) (calculaArea()/area);
		
		return q;
	}

	@Override
	public String toString() {
		return "Porta [largura=" + largura + ", altura=" + altura + ", cor=" + cor + "]";
	}
}
