package com.agriflux.agrifluxshared.service.particella;

import java.util.List;

import com.agriflux.agrifluxshared.dto.particella.DatiParticellaDTO;

public interface DatiParticellaService {
	
	/**
	 * Metodo che restituisce la lista di Particelle ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di DatiParticellaDTO
	 */
	List<DatiParticellaDTO> findAllParticellaSortById();
}
