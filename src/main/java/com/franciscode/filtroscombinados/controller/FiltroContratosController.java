package com.franciscode.filtroscombinados.controller;

import com.franciscode.filtroscombinados.helper.FiltroContratosHelper;
import com.franciscode.filtroscombinados.viewModel.ContratosResponseViewModel;
import com.franciscode.filtroscombinados.viewModel.FiltroContratosRequestViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/contratos")
public class FiltroContratosController {

    @Autowired
    private FiltroContratosHelper helper;

    @GetMapping(value = "/listagem")
    public ResponseEntity<List<ContratosResponseViewModel>> getFiltroListagemContratos(
            @RequestParam(value = "cpf_cnpj", required = false) String cpfCnpj,
            @RequestParam(value = "data_periodo_inicio", required = false) String dataPeriodoInicio,
            @RequestParam(value = "data_periodo_fim", required = false) String dataPeriodoFim,
            @RequestParam(value = "id_contrato", required = false) String idContrato,
            @RequestParam(value = "data_vencimento_inicio", required = false) String dataVencimentoInicio,
            @RequestParam(value = "data_vencimento_fim", required = false) String dataVencimentoFim,
            @RequestParam(value = "valor_inicio", required = false) BigDecimal valorInicio,
            @RequestParam(value = "valor_fim", required = false) BigDecimal valorFim
    ) {

        FiltroContratosRequestViewModel requestViewModel = new FiltroContratosRequestViewModel();
        requestViewModel.setCpfCnpj(cpfCnpj);
        requestViewModel.setDataPeriodoInicio(dataPeriodoInicio);
        requestViewModel.setDataPeriodoFim(dataPeriodoFim);
        requestViewModel.setIdContrato(idContrato);
        requestViewModel.setDataVencimentoInicio(dataVencimentoInicio);
        requestViewModel.setDataVencimentoFim(dataVencimentoFim);
        requestViewModel.setValorInicio(valorInicio);
        requestViewModel.setValorFim(valorFim);

        List<ContratosResponseViewModel> list = helper.getContratosFiltrados(requestViewModel);

        return ResponseEntity.ok().body(list);
    }


}
