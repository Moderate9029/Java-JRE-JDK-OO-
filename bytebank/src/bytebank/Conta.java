package bytebank;

public class Conta {

	// Atributos
	double saldo;
	int agencia = 42;
	int numero;
	String titular;

	// Construtor

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
}
