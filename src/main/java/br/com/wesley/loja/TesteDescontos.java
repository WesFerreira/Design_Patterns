package br.com.wesley.loja;

import br.com.wesley.loja.desconto.CalculadoraDesconto;
import br.com.wesley.loja.imposto.CalculadoraImpostos;
import br.com.wesley.loja.imposto.ICMS;
import br.com.wesley.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200.0"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }

}
