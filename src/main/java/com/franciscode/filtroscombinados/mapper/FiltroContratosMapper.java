package com.franciscode.filtroscombinados.mapper;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
import com.franciscode.filtroscombinados.dtos.LiberacoesDTO;
import com.franciscode.filtroscombinados.viewModel.ContratosResponseViewModel;
import com.franciscode.filtroscombinados.viewModel.FiltroContratosRequestViewModel;
import com.franciscode.filtroscombinados.viewModel.LiberacoesViewModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroContratosMapper {

    public static List<ContratosResponseViewModel> toViewContratos(FiltroContratosRequestViewModel requestViewModel, List<ContratosResponseDTO> responseDTOList) {

        if (responseDTOList != null) {
            return responseDTOList.stream()
                    .filter(contrato -> (requestViewModel.getCpfCnpj() == null || contrato.getCpfCnpj().equals(requestViewModel.getCpfCnpj())))
                    .filter(contrato -> (requestViewModel.getIdContrato() == null || contrato.getIdContrato().equals(requestViewModel.getIdContrato())))

                    .filter(contrato -> (requestViewModel.getDataPeriodoInicio() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoInicio()) >= 0) &&
                            (requestViewModel.getDataPeriodoFim() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoFim()) <= 0))

                    //.filter(contrato -> (requestViewModel.getDataPeriodoInicio() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoInicio()) >= 0))
                    //.filter(contrato -> (requestViewModel.getDataPeriodoFim() == null || contrato.getDataContratacao().compareTo(requestViewModel.getDataPeriodoFim()) <= 0))

                    .filter(contrato -> (requestViewModel.getDataVencimentoInicio() == null || contrato.getDataVencimento().compareTo(requestViewModel.getDataVencimentoInicio()) >= 0))
                    .filter(contrato -> (requestViewModel.getDataVencimentoFim() == null || contrato.getDataVencimento().compareTo(requestViewModel.getDataVencimentoFim()) <= 0))
                    .filter(contrato -> (requestViewModel.getValorInicio() == null || contrato.getValor().compareTo(requestViewModel.getValorInicio()) >= 0))
                    .filter(contrato -> (requestViewModel.getValorFim() == null || contrato.getValor().compareTo(requestViewModel.getValorFim()) <= 0))
                    .map(dto -> {
                        ContratosResponseViewModel contratosResponseViewModel = new ContratosResponseViewModel();
                        List<LiberacoesViewModel> liberacoesViewModelList = new ArrayList<>();

                        for (LiberacoesDTO lib : dto.getLiberacoes()) {
                            LiberacoesViewModel liberacoesViewModel = new LiberacoesViewModel();
                            liberacoesViewModel.setCoigoLiberacao(lib.getCoigoLiberacao());
                            liberacoesViewModel.setNumeroLiberacao(lib.getNumeroLiberacao());
                            liberacoesViewModel.setValorLiberacao(lib.getValorLiberacao());

                            liberacoesViewModelList.add(liberacoesViewModel);
                        }

                        contratosResponseViewModel.setLiberacoes(liberacoesViewModelList);
                        contratosResponseViewModel.setIdContrato(dto.getIdContrato());
                        contratosResponseViewModel.setCpfCnpj(dto.getCpfCnpj());
                        contratosResponseViewModel.setIndex(dto.getIndex());
                        contratosResponseViewModel.setPercentual(dto.getPercentual());
                        contratosResponseViewModel.setValor(dto.getValor());
                        contratosResponseViewModel.setDataContratacao(dto.getDataContratacao());
                        contratosResponseViewModel.setDataVencimento(dto.getDataVencimento());
                        return contratosResponseViewModel;
                    })
                    .collect(Collectors.toList());

        } else {
            return null;
        }
    }

}
