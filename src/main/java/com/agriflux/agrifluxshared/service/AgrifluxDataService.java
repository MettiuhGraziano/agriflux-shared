package com.agriflux.agrifluxshared.service;

import java.util.List;

import com.agriflux.agrifluxshared.dto.ColturaDTO;

public interface AgrifluxDataService {
	
	/**
	 * Metodo che torna la lista di Colture ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ColtureDTO
	 */
	List<ColturaDTO> findAllColturaSortById();
}
