package com.agriflux.agrifluxshared.service;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.AmbienteDTO;
import com.agriflux.agrifluxshared.dto.ColturaDTO;
import com.agriflux.agrifluxshared.dto.ColturaGroupByProdottoDTO;
import com.agriflux.agrifluxshared.dto.ColturaListPrezzoDataRaccoltoDTO;
import com.agriflux.agrifluxshared.dto.MorfologiaDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneColturaDTO;
import com.agriflux.agrifluxshared.dto.TerrenoDTO;

public interface AgrifluxDataService {
	
	/**
	 * Metodo che restituisce la lista di Colture ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ColtureDTO
	 */
	List<ColturaDTO> findAllColturaSortById();
	
	/**
	 * Metodo che restituisce la lista di dati Ambientali ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di AmbienteDTO
	 */
	List<AmbienteDTO> findAllAmbienteSortById();
	
	/**
	 * Metodo che restituisce la lista di dati Morfologici ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di MorfologiaDTO
	 */
	List<MorfologiaDTO> findAllMorfologiaSortById();
	
	/**
	 * Metodo che restituisce la lista di Terreni ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di TerrenoDTO
	 */
	List<TerrenoDTO> findAllTerrenoSortById();
	
	/**
	 * Metodo che restituisce la lista di dati di Produzione ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ProduzioneDTO
	 */
	List<ProduzioneDTO> findAllProduzioneSortById();
	
	/**
	 * Metodo che restituisce una lista di oggetti che rappresentano il numero di prodotti singoli coltivati
	 * raggruppati per il nome del prodotto coltivato stesso
	 * 
	 * @return List di ColturaGroupByProdottoDTO
	 */
	List<ColturaGroupByProdottoDTO> countColtureGroupByProdotto();
	
	/**
	 * Metodo che restituisce una mappa con in chiave la tipologia di prodotto e come valore un oggetto
	 * che ha le liste di prezzi e date raccolto relative a quel determinato prodotto
	 * 
	 * @return Map di ColturaListPrezzoDataRaccoltoDTO
	 */
	Map<String, ColturaListPrezzoDataRaccoltoDTO> findPrezziAndDateColtura();
	
	/**
	 * Metodo che restituisce una mappa con chiave la tipologia di prodotto e come valore un'altra mappa con chiave
	 * l'anno di riferimento e come valore un oggetto contenente i dati sulla quantita' del raccolto ed il fatturato
	 * relativo a quell'anno
	 * 
	 * @return Map -> key : Prodotto | value : Map -> key : Anno Riferimento | value : {@code ProduzioneColturaDTO}
	 */
	Map<String, Map<String, ProduzioneColturaDTO>> findColtureJoinProduzione();
}
