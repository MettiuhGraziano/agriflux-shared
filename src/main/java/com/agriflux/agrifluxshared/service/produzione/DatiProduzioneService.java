package com.agriflux.agrifluxshared.service.produzione;

import java.util.List;

import com.agriflux.agrifluxshared.dto.produzione.ProduzioneDTO;

public interface DatiProduzioneService {
	
	/**
	 * Metodo che restituisce la lista di dati di Produzione ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ProduzioneDTO
	 */
	List<ProduzioneDTO> findAllProduzioneSortById();
	
}
