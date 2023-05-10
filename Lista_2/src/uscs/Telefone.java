package uscs;

public class Telefone {

	//Atributos
	private String numero;
	private int ddd;
	private int ddi;
	private String tipo;
	
	public Telefone(String numero, int ddd, int ddi, String tipo) {
		this.numero = numero;
		this.ddd = ddd;
		this.ddi = ddi;
		this.tipo = tipo;
	}
	
	public Telefone() {
		this.numero = "";
		this.ddd = 0;
		this.ddi = 0;
		this.tipo = "";
	}
	
	
	public String getNumero() {
		return numero;
	}

	public int getDdd() {
		return ddd;
	}

	public int getDdi() {
		return ddi;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean verificaLigacaoNacional() {
		if(getDdi() == 55) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", ddd=" + ddd + ", ddi=" + ddi + ", tipo=" + tipo + "]";
	}
	
	
}
