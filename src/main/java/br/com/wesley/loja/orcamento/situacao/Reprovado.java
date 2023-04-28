package br.com.wesley.loja.orcamento.situacao;

import br.com.wesley.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
