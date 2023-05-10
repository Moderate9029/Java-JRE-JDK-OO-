package uscs;

public class Pessoa {

	private String primeiroNome;
	private String sobrenome;
	private String dia;
	private String mes;
	private String ano;
	private String telefone;
	private String email;
	
	
	
	public Pessoa(String primeiroNome, String sobrenome, String dia, String mes, String ano, String telefone, String email) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa() {
		this.primeiroNome = "";
		this.sobrenome = "";
		this.dia = "";
		this.telefone = "";
		this.email = "";
	}
	
	

	public String getPrimeironome() {
		return primeiroNome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public String getDia() {
		return dia;
	}

	public String getMes() {
		return mes;
	}
	
	public String getAno() {
		return ano;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String geraUsuario() {
		String virgula = ", ";
		String userDesc = getPrimeironome() + getSobrenome() + virgula + getDia() + "/" + getMes() + "/" + getAno() + virgula + getTelefone() + virgula + getEmail();		
		return userDesc;
	}
	
	public String geraSenha() {
		return (getPrimeironome() + getAno());
	}
	
	public int calculaIdade(int dia, int mes, int ano) {
		int idade = ano - Integer.parseInt(getAno());
		if(Integer.parseInt(getMes()) < mes && Integer.parseInt(getDia()) < dia) {
			idade--;
		}
		return idade;
	}
	
	public boolean validaEleitor(int dia, int mes, int ano) {
		int idade = calculaIdade(dia, mes, ano);
		if(idade < 16) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [primeiroNome=" + primeiroNome + ", sobrenome=" + sobrenome + ", dia=" + dia + ", mes=" + mes
				+ ", ano=" + ano + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
