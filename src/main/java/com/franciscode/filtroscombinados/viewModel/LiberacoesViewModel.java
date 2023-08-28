package com.franciscode.filtroscombinados.viewModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

public class LiberacoesViewModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -3608355413607120497L;

    @JsonProperty("numero_liberacao")
    private String numeroLiberacao;

    @JsonProperty("valor_liberacao")
    private String valorLiberacao;

    @JsonProperty("codigo_liberacao")
    private String coigoLiberacao;

    public String getNumeroLiberacao() {
        return numeroLiberacao;
    }

    public void setNumeroLiberacao(String numeroLiberacao) {
        this.numeroLiberacao = numeroLiberacao;
    }

    public String getValorLiberacao() {
        return valorLiberacao;
    }

    public void setValorLiberacao(String valorLiberacao) {
        this.valorLiberacao = valorLiberacao;
    }

    public String getCoigoLiberacao() {
        return coigoLiberacao;
    }

    public void setCoigoLiberacao(String coigoLiberacao) {
        this.coigoLiberacao = coigoLiberacao;
    }
}
