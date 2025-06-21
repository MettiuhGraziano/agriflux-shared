package com.agriflux.agrifluxshared.service.terreno;

import java.util.List;

import com.agriflux.agrifluxshared.dto.terreno.TerrenoDTO;

public interface DatiRilevazioneTerrenoService {
	
	/**
	 * Metodo che restituisce la lista di Rilevazioni delle Particelle ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di TerrenoDTO
	 */
	List<TerrenoDTO> findAllRilevazioneTerrenoSortById();
}
