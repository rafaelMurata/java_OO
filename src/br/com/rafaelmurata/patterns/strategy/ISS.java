package br.com.rafaelmurata.patterns.strategy;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor()*0.1;

	}
}