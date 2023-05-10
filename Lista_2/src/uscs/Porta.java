package uscs;

public class Porta {

	private double largura;
	private double altura;
	private String cor;
	
	public Porta(double largura, double altura, String cor) {
		this.largura = largura;
		this.altura = altura;
		this.cor = cor;
	}
	
	public Porta() {
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
	
	public double calculaQuantidadeVerniz(int rendimento) {
		double rende =  (calculaArea() / rendimento);
		return rende;
	}

	@Override
	public String toString() {
		return "Porta [largura=" + largura + ", altura=" + altura + ", cor=" + cor + "]";
	}
	
}
