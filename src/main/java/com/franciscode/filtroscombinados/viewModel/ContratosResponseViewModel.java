package com.franciscode.filtroscombinados.viewModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ContratosResponseViewModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -7261919455841853945L;

    @JsonProperty("cpf_cnpj")
    private String cpfCnpj;

    @JsonProperty("data_contratacao")
    private String dataContratacao;

    @JsonProperty("id_contrato")
    private String idContrato;

    @JsonProperty("data_vencimento")
    private String dataVencimento;

    @JsonProperty("valor")
    private BigDecimal valor;

    @JsonProperty("index")
    private String index;

    @JsonProperty("percentual")
    private String percentual;

    @JsonProperty("liberacoes")
    private List<LiberacoesViewModel> liberacoes;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPercentual() {
        return percentual;
    }

    public void setPercentual(String percentual) {
        this.percentual = percentual;
    }

    public List<LiberacoesViewModel> getLiberacoes() {
        return liberacoes;
    }

    public void setLiberacoes(List<LiberacoesViewModel> liberacoes) {
        this.liberacoes = liberacoes;
    }
}
