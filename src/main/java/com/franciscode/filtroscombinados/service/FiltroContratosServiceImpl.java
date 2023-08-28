package com.franciscode.filtroscombinados.service;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
import com.franciscode.filtroscombinados.dtos.LiberacoesDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FiltroContratosServiceImpl implements FiltroContratosService {

    @Override
    public List<ContratosResponseDTO> getContratos() {

        ContratosResponseDTO contratosResponseDTO1 = new ContratosResponseDTO();
        contratosResponseDTO1.setCpfCnpj("12345678976");
        contratosResponseDTO1.setDataContratacao("17/12/2022");
        contratosResponseDTO1.setDataVencimento("31/12/2022");
        contratosResponseDTO1.setValor(new BigDecimal("98000.0"));
        contratosResponseDTO1.setIdContrato("42343687");
        contratosResponseDTO1.setIndex("SELIC");
        contratosResponseDTO1.setPercentual("40.00");
        LiberacoesDTO liberacoesDTO1 = new LiberacoesDTO();
        List<LiberacoesDTO> liberacoesDTOList1 = new ArrayList<>();
        liberacoesDTO1.setNumeroLiberacao("12345");
        liberacoesDTO1.setValorLiberacao("5000");
        liberacoesDTO1.setCoigoLiberacao("8362196");
        liberacoesDTOList1.add(liberacoesDTO1);
        contratosResponseDTO1.setLiberacoes(liberacoesDTOList1);

        ContratosResponseDTO contratosResponseDTO2 = new ContratosResponseDTO();
        contratosResponseDTO2.setCpfCnpj("12345898976");
        contratosResponseDTO2.setDataContratacao("17/12/2020");
        contratosResponseDTO2.setDataVencimento("31/12/2024");
        contratosResponseDTO2.setValor(new BigDecimal("50000.0"));
        contratosResponseDTO2.setIdContrato("42443797");
        contratosResponseDTO2.setIndex("SELIC");
        contratosResponseDTO2.setPercentual("40.00");
        LiberacoesDTO liberacoesDTO2 = new LiberacoesDTO();
        List<LiberacoesDTO> liberacoesDTOList2 = new ArrayList<>();
        liberacoesDTO2.setNumeroLiberacao("12345");
        liberacoesDTO2.setValorLiberacao("5000");
        liberacoesDTO2.setCoigoLiberacao("8362196");
        liberacoesDTOList2.add(liberacoesDTO2);
        contratosResponseDTO2.setLiberacoes(liberacoesDTOList2);

        ContratosResponseDTO contratosResponseDTO3 = new ContratosResponseDTO();
        contratosResponseDTO3.setCpfCnpj("12345898976");
        contratosResponseDTO3.setDataContratacao("17/12/2021");
        contratosResponseDTO3.setDataVencimento("31/12/2023");
        contratosResponseDTO3.setValor(new BigDecimal("100000.0"));
        contratosResponseDTO3.setIdContrato("32543797");
        contratosResponseDTO3.setIndex("SELIC");
        contratosResponseDTO3.setPercentual("40.00");
        LiberacoesDTO liberacoesDTO3 = new LiberacoesDTO();
        List<LiberacoesDTO> liberacoesDTOList3 = new ArrayList<>();
        liberacoesDTO3.setNumeroLiberacao("12345");
        liberacoesDTO3.setValorLiberacao("5000");
        liberacoesDTO3.setCoigoLiberacao("8362196");
        liberacoesDTOList3.add(liberacoesDTO3);
        contratosResponseDTO3.setLiberacoes(liberacoesDTOList3);

        ContratosResponseDTO contratosResponseDTO4 = new ContratosResponseDTO();
        contratosResponseDTO4.setCpfCnpj("05845898976");
        contratosResponseDTO4.setDataContratacao("17/12/2015");
        contratosResponseDTO4.setDataVencimento("31/12/2020");
        contratosResponseDTO4.setValor(new BigDecimal("10000.0"));
        contratosResponseDTO4.setIdContrato("32563799");
        contratosResponseDTO4.setIndex("SELIC");
        contratosResponseDTO4.setPercentual("40.00");
        LiberacoesDTO liberacoesDTO4 = new LiberacoesDTO();
        List<LiberacoesDTO> liberacoesDTOList4 = new ArrayList<>();
        liberacoesDTO4.setNumeroLiberacao("12345");
        liberacoesDTO4.setValorLiberacao("5000");
        liberacoesDTO4.setCoigoLiberacao("8362196");
        liberacoesDTOList4.add(liberacoesDTO4);
        contratosResponseDTO4.setLiberacoes(liberacoesDTOList4);

        ContratosResponseDTO contratosResponseDTO5 = new ContratosResponseDTO();
        contratosResponseDTO5.setCpfCnpj("05845898976");
        contratosResponseDTO5.setDataContratacao("17/12/2015");
        contratosResponseDTO5.setDataVencimento("31/12/2020");
        contratosResponseDTO5.setValor(new BigDecimal("10000.0"));
        contratosResponseDTO5.setIdContrato("32563799");
        contratosResponseDTO5.setIndex("SELIC");
        contratosResponseDTO5.setPercentual("40.00");
        LiberacoesDTO liberacoesDTO5 = new LiberacoesDTO();
        List<LiberacoesDTO> liberacoesDTOList5 = new ArrayList<>();
        liberacoesDTO5.setNumeroLiberacao("12345");
        liberacoesDTO5.setValorLiberacao("5000");
        liberacoesDTO5.setCoigoLiberacao("8362196");
        liberacoesDTOList5.add(liberacoesDTO5);
        contratosResponseDTO5.setLiberacoes(liberacoesDTOList5);

        List<ContratosResponseDTO> responseDTOList = new ArrayList<>();
        responseDTOList.add(contratosResponseDTO1);
        responseDTOList.add(contratosResponseDTO2);
        responseDTOList.add(contratosResponseDTO3);
        responseDTOList.add(contratosResponseDTO4);
        responseDTOList.add(contratosResponseDTO5);

        return responseDTOList;
    }
}
