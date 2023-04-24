package br.com.wesley.loja;

import br.com.wesley.loja.imposto.CalculadoraImpostos;
import br.com.wesley.loja.imposto.ICMS;
import br.com.wesley.loja.imposto.ISS;
import br.com.wesley.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.0"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }

}
