package br.com.fiap.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	private String nuAgencia;
	private int nuConta;
	private String nomeTitular;
	protected double saldo;

	public Conta(String nuAgencia, int nuConta, String nomeTitular, double saldo) {
		this.nuAgencia = nuAgencia;
		this.nuConta = nuConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Conta() {
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return "Conta [nuAgencia=" + nuAgencia + ", nuConta=" + nuConta
				+ ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		Conta other = (Conta) obj;

		return this.nuAgencia.equals(other.nuAgencia)
				&& this.nuConta == other.nuConta;

	}

	public int compareTo(Conta outraConta) {
		return this.nomeTitular.compareTo(outraConta.nomeTitular);
	}

	public String getNuAgencia() {
		return nuAgencia;
	}

	public void setNuAgencia(String nuAgencia) {
		this.nuAgencia = nuAgencia;
	}

	public int getNuConta() {
		return nuConta;
	}

	public void setNuConta(int nuConta) {
		this.nuConta = nuConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
