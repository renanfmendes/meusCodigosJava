package br.com.fiap.contas.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nuAgencia, int nuConta, String nomeTitular,
			double saldo) {
		super(nuAgencia, nuConta, nomeTitular, saldo);
	}
	
	public ContaPoupanca(){
		
	}

	public String getTipo() {
		return "Conta Poupança";
	}

}
