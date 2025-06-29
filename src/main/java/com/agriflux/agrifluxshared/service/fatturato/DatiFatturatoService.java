package com.agriflux.agrifluxshared.service.fatturato;

import java.util.List;

import com.agriflux.agrifluxshared.dto.fatturato.FatturatoDTO;

public interface DatiFatturatoService {
	
	/**
	 * Metodo che restituisce la lista di Fatturati ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di FatturatoDTO
	 */
	List<FatturatoDTO> findAllFatturatoSortById();
}
