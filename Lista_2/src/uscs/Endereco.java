package uscs;

public class Endereco {

	// Atributos
	private String logradouro;
	private int numero;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;
	private String pais;

	public Endereco(String logradouro, int numero, String complemento, String cidade, String estado, String cep,
			String pais) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.pais = pais;
	}

	public Endereco() {
		this.logradouro = "";
		this.numero = 0;
		this.complemento = "";
		this.cidade = "";
		this.estado = "";
		this.cep = "";
		this.pais = "";
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public String getPais() {
		return pais;
	}

	public String obtemEstadoPorExtenso() {
		String virgula = ", ";
		String extenso = getLogradouro() + virgula + getNumero() + virgula + getCidade() + virgula + getEstado()
				+ virgula + getPais() + virgula + getComplemento();
		return extenso;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", pais=" + pais + "]";
	}

}
