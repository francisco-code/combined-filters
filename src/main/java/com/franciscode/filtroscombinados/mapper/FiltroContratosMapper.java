package com.franciscode.filtroscombinados.mapper;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
import com.franciscode.filtroscombinados.viewModel.ContratosResponseViewModel;
import com.franciscode.filtroscombinados.viewModel.FiltroContratosRequestViewModel;

import java.util.ArrayList;
import java.util.List;

public class FiltroContratosMapper {

    public List<ContratosResponseViewModel> toViewContratos(FiltroContratosRequestViewModel requestViewModel, List<ContratosResponseDTO> responseDTOList) {

        List<ContratosResponseDTO> contratosFiltrados = responseDTOList.stream()
                .filter(contrato -> requestViewModel.getCpfCnpj() == null || contrato.getCpfCnpj().equals(responseDTOList.get(0).getCpfCnpj()))
                .filter(contrato -> requestViewModel.getIdContrato() == null || contrato.getIdContrato().equals(responseDTOList.get(0).getIdContrato()))
                .filter(contrato -> requestViewModel.getDataPeriodoInicio() == null || contrato.getDataContratacao().compareTo(responseDTOList.get(0).getDataContratacao()) >= 0)
                .filter(contrato -> requestViewModel.getDataPeriodoFim() == null || contrato.getDataContratacao().compareTo(responseDTOList.get(0).getDataContratacao()) <= 0)
                .filter(contrato -> requestViewModel.getDataVencimentoInicio() == null || contrato.getDataVencimento().compareTo(responseDTOList.get(0).getDataVencimento()) >= 0)
                .filter(contrato -> requestViewModel.getDataVencimentoFim() == null || contrato.getDataVencimento().compareTo(responseDTOList.get(0).getDataVencimento()) <= 0)
                .filter(contrato -> requestViewModel.getValorInicio() == null || contrato.getValor().compareTo(responseDTOList.get(0).getValor()) >= 0)
                .filter(contrato -> requestViewModel.getValorFim() == null || contrato.getValor().compareTo(responseDTOList.get(0).getValor()) <= 0).toList();


        List<ContratosResponseViewModel> contratosResponseViewModelList = new ArrayList<>();

        for (ContratosResponseDTO dto : contratosFiltrados) {
            ContratosResponseViewModel contratosResponseViewModel = new ContratosResponseViewModel();
            contratosResponseViewModel.setIdContrato(dto.getIdContrato());
            contratosResponseViewModel.setCpfCnpj(dto.getCpfCnpj());
            contratosResponseViewModel.setIndex(dto.getIndex());
            contratosResponseViewModel.setLiberacoes(dto.getLiberacoes());
            contratosResponseViewModel.setPercentual(dto.getPercentual());
            contratosResponseViewModel.setValor(dto.getValor());
            contratosResponseViewModel.setDataContratacao(dto.getDataContratacao());

            contratosResponseViewModelList.add(contratosResponseViewModel);
        }

        return contratosResponseViewModelList;
    }


}
