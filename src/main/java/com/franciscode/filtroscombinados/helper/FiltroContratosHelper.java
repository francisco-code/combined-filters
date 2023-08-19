package com.franciscode.filtroscombinados.helper;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
import com.franciscode.filtroscombinados.service.FiltroContratosService;
import com.franciscode.filtroscombinados.viewModel.ContratosResponseViewModel;
import com.franciscode.filtroscombinados.viewModel.FiltroContratosRequestViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FiltroContratosHelper {

    @Autowired
    private FiltroContratosService service;

    public List<ContratosResponseViewModel> getContratosFiltrados(FiltroContratosRequestViewModel requestViewModel) {

        List<ContratosResponseDTO> responseDTOList = service.getContratos();


        return toViewContratos(requestViewModel, responseDTOList);
    }
}
