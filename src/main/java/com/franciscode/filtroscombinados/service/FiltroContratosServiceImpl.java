package com.franciscode.filtroscombinados.service;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;
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
        contratosResponseDTO1.setLiberacoes("2");

        ContratosResponseDTO contratosResponseDTO2 = new ContratosResponseDTO();
        contratosResponseDTO2.setCpfCnpj("12345898976");
        contratosResponseDTO2.setDataContratacao("17/12/2020");
        contratosResponseDTO2.setDataVencimento("31/12/2024");
        contratosResponseDTO2.setValor(new BigDecimal("50000.0"));
        contratosResponseDTO2.setIdContrato("42443797");
        contratosResponseDTO2.setIndex("SELIC");
        contratosResponseDTO2.setPercentual("40.00");
        contratosResponseDTO2.setLiberacoes("2");

        ContratosResponseDTO contratosResponseDTO3 = new ContratosResponseDTO();
        contratosResponseDTO3.setCpfCnpj("12345898976");
        contratosResponseDTO3.setDataContratacao("17/12/2021");
        contratosResponseDTO3.setDataVencimento("31/12/2023");
        contratosResponseDTO3.setValor(new BigDecimal("100000.0"));
        contratosResponseDTO3.setIdContrato("32543797");
        contratosResponseDTO3.setIndex("SELIC");
        contratosResponseDTO3.setPercentual("40.00");
        contratosResponseDTO3.setLiberacoes("2");

        ContratosResponseDTO contratosResponseDTO4 = new ContratosResponseDTO();
        contratosResponseDTO4.setCpfCnpj("05845898976");
        contratosResponseDTO4.setDataContratacao("17/12/2015");
        contratosResponseDTO4.setDataVencimento("31/12/2020");
        contratosResponseDTO4.setValor(new BigDecimal("10000.0"));
        contratosResponseDTO4.setIdContrato("32563799");
        contratosResponseDTO4.setIndex("SELIC");
        contratosResponseDTO4.setPercentual("40.00");
        contratosResponseDTO4.setLiberacoes("2");

        List<ContratosResponseDTO> responseDTOList = new ArrayList<>();
        responseDTOList.add(contratosResponseDTO1);
        responseDTOList.add(contratosResponseDTO2);
        responseDTOList.add(contratosResponseDTO3);
        responseDTOList.add(contratosResponseDTO4);

        return responseDTOList;
    }
}
