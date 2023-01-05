package bytebank;

public class Conta {

	// Atributos
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;
	private static int total;

	// Construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de conta é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta");
	}

	// Métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você retirou " + valor + ", restando no seu saldo " + this.saldo);
			return true;
		} else {
			System.out.println("Seu saldo é insuficiente!!!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (saldoSuficiente(valor)) {
			this.saldo -= valor;
			destino.deposita(valor);

			System.out.println("A transferencia de " + valor + " foi um sucesso");
			return true;
		} else {
			System.out.println("Saldo insuficiente!!!");
			return false;
		}
	}

	public boolean saldoSuficiente(double valor) {
		if (this.saldo >= valor) {
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
