package com.franciscode.filtroscombinados.viewModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class FiltroContratosRequestViewModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -561842395404626723L;

    @JsonProperty("cpf_cnpj")
    private String cpfCnpj;

    @JsonProperty("data_periodo_inicio")
    private String dataPeriodoInicio;

    @JsonProperty("data_periodo_fim")
    private String dataPeriodoFim;

    @JsonProperty("id_contrato")
    private String idContrato;

    @JsonProperty("data_vencimento_inicio")
    private String dataVencimentoInicio;

    @JsonProperty("data_vencimento_fim")
    private String dataVencimentoFim;

    @JsonProperty("valor_inicio")
    private BigDecimal valorInicio;

    @JsonProperty("valor_fim")
    private BigDecimal valorFim;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDataPeriodoInicio() {
        return dataPeriodoInicio;
    }

    public void setDataPeriodoInicio(String dataPeriodoInicio) {
        this.dataPeriodoInicio = dataPeriodoInicio;
    }

    public String getDataPeriodoFim() {
        return dataPeriodoFim;
    }

    public void setDataPeriodoFim(String dataPeriodoFim) {
        this.dataPeriodoFim = dataPeriodoFim;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getDataVencimentoInicio() {
        return dataVencimentoInicio;
    }

    public void setDataVencimentoInicio(String dataVencimentoInicio) {
        this.dataVencimentoInicio = dataVencimentoInicio;
    }

    public String getDataVencimentoFim() {
        return dataVencimentoFim;
    }

    public void setDataVencimentoFim(String dataVencimentoFim) {
        this.dataVencimentoFim = dataVencimentoFim;
    }

    public BigDecimal getValorInicio() {
        return valorInicio;
    }

    public void setValorInicio(BigDecimal valorInicio) {
        this.valorInicio = valorInicio;
    }

    public BigDecimal getValorFim() {
        return valorFim;
    }

    public void setValorFim(BigDecimal valorFim) {
        this.valorFim = valorFim;
    }
}
