package br.com.fiap.contas.exception;

public class SaldoInsuficienteException extends RuntimeException {

	private static final long serialVersionUID = -7557823768717164127L;

	public SaldoInsuficienteException (double valor) {
        super("Saldo insuficiente para sacar o valor de: valor");

    }
}
