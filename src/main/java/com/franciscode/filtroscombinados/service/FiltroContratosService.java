package com.franciscode.filtroscombinados.service;

import com.franciscode.filtroscombinados.dtos.ContratosResponseDTO;

import java.util.List;

public interface FiltroContratosService {

    List<ContratosResponseDTO> getContratos();
}
