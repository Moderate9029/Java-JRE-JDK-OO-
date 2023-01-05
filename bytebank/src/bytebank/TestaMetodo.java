package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		// Depositar
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		contaDoFelipe.deposita(50);

		// Sacar
		contaDoFelipe.saca(20);
		System.out.println(contaDoFelipe.saldo);

		// Transferir
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		contaDaMarcela.transfere(300, contaDoFelipe);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoFelipe.saldo);
		
		contaDoFelipe.titular = "felipe sarmento";
		System.out.println(contaDoFelipe.titular);
		
	}
}
