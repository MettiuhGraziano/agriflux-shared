package com.agriflux.agrifluxshared.service.ambiente;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.ambiente.AmbienteDTO;
import com.agriflux.agrifluxshared.dto.ambiente.VariazioneValoriParametriAmbienteDTO;

public interface DatiAmbienteService {
	
	/**
	 * Metodo che restituisce la lista di dati Ambientali ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di AmbienteDTO
	 */
	List<AmbienteDTO> findAllAmbienteSortById();
	
	/**
	 * Metodo che restituisce la lista dei parametri calcolati relativi ai Dati Ambientali
	 * 
	 * @return Lista di String
	 */
	List<String> getListaParametriAmbiente();
	
	/**
	 * Metodo che restituisce una mappa con in chiave i nomi dei parametri calcolati sull'Ambiente e come valore una lista di oggetti
	 * contenente il valore del campo, la data di rilevazione e la percentuale di variazione rispetto l'anno precedente
	 * 
	 * @return
	 */
	Map<String, List<VariazioneValoriParametriAmbienteDTO>> getVariazioneValoriParametriAmbiente();
}
