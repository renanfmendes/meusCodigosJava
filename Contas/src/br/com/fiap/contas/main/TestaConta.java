package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import com.sun.swing.internal.plaf.synth.resources.synth_sv;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(-1);
        c1.saca(100);
        System.out.println(c1.getSaldo());
        System.out.println(c1.getTipo());

        ContaPoupanca c2 = new ContaPoupanca();
        c2.deposita(300000);
        c2.saca(100);
        System.out.println(c2.getSaldo());
        System.out.println(c2.getTipo());

    }
}
