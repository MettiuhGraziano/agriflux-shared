package com.agriflux.agrifluxshared.service;

import java.util.List;

import com.agriflux.agrifluxshared.dto.ambiente.AmbienteDTO;

public interface AgrifluxDataService {
	
	/**
	 * Metodo che restituisce la lista di dati Ambientali ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di AmbienteDTO
	 */
	List<AmbienteDTO> findAllAmbienteSortById();
	
}
