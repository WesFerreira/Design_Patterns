package br.com.wesley.loja.desconto;

import br.com.wesley.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return cadeiaDeDesconto.efetuarCalculo(orcamento);
    }
}
