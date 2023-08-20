package com.franciscode.filtroscombinados.mapper;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
import com.franciscode.filtroscombinados.viewModel.ContratosResponseViewModel;
import com.franciscode.filtroscombinados.viewModel.FiltroContratosRequestViewModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroContratosMapper {

    public static List<ContratosResponseViewModel> toViewContratos(FiltroContratosRequestViewModel requestViewModel, List<ContratosResponseDTO> responseDTOList) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<ContratosResponseDTO> contratosFiltrados = responseDTOList.stream()
                .filter(contrato -> requestViewModel.getCpfCnpj() == null || contrato.getCpfCnpj().equals(requestViewModel.getCpfCnpj()))
                .filter(contrato -> requestViewModel.getIdContrato() == null || contrato.getIdContrato().equals(requestViewModel.getIdContrato()))
                .filter(contrato -> requestViewModel.getDataPeriodoInicio() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoInicio()) >= 0)
                .filter(contrato -> requestViewModel.getDataPeriodoFim() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoFim()) <= 0)
                .filter(contrato -> requestViewModel.getDataVencimentoInicio() == null || contrato.getDataVencimento().compareTo(requestViewModel.getDataVencimentoInicio()) >= 0)
                .filter(contrato -> requestViewModel.getDataVencimentoFim() == null || contrato.getDataVencimento().compareTo(requestViewModel.getDataVencimentoFim()) <= 0)
                .filter(contrato -> requestViewModel.getValorInicio() == null || contrato.getValor().compareTo(requestViewModel.getValorInicio()) >= 0)
                .filter(contrato -> requestViewModel.getValorFim() == null || contrato.getValor().compareTo(requestViewModel.getValorFim()) <= 0).toList();


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
            contratosResponseViewModel.setDataVencimento(dto.getDataVencimento());

            contratosResponseViewModelList.add(contratosResponseViewModel);
        }

        return contratosResponseViewModelList;
    }
}
