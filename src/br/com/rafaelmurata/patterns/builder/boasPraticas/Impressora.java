package br.com.rafaelmurata.patterns.builder.boasPraticas;

import br.com.rafaelmurata.patterns.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{


	public void executa(NotaFiscal nf) {
        System.out.println("imprimindo notaFiscal");
		
	}
}
