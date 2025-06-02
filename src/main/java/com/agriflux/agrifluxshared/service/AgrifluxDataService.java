package com.agriflux.agrifluxshared.service;

import java.util.List;

import com.agriflux.agrifluxshared.dto.AmbienteDTO;
import com.agriflux.agrifluxshared.dto.ColturaDTO;
import com.agriflux.agrifluxshared.dto.MorfologiaDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneDTO;
import com.agriflux.agrifluxshared.dto.TerrenoDTO;

public interface AgrifluxDataService {
	
	/**
	 * Metodo che torna la lista di Colture ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ColtureDTO
	 */
	List<ColturaDTO> findAllColturaSortById();
	
	/**
	 * Metodo che torna la lista di dati Ambientali ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di AmbienteDTO
	 */
	List<AmbienteDTO> findAllAmbienteSortById();
	
	/**
	 * Metodo che torna la lista di dati Morfologici ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di MorfologiaDTO
	 */
	List<MorfologiaDTO> findAllMorfologiaSortById();
	
	/**
	 * Metodo che torna la lista di Terreni ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di TerrenoDTO
	 */
	List<TerrenoDTO> findAllTerrenoSortById();
	
	/**
	 * Metodo che torna la lista di dati di Produzione ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ProduzioneDTO
	 */
	List<ProduzioneDTO> findAllProduzioneSortById();
}
