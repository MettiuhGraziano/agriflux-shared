package com.agriflux.agrifluxshared.service.coltura;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.coltura.ColturaDTO;
import com.agriflux.agrifluxshared.dto.coltura.ColturaListPrezzoDataRaccoltoDTO;

public interface DatiColturaService {
	
	/**
	 * Metodo che restituisce la lista di Colture ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ColtureDTO
	 */
	List<ColturaDTO> findAllColturaSortById();
	
	/**
	 * Metodo che restituisce una mappa con in chiave la tipologia di prodotto e come valore il numero di
	 * volte nelle quali quel prodotto è stato coltivato
	 * 
	 * @return Map<String, Long>
	 */
	Map<String, Long> countOrtaggioColtura();
	
	/**
	 * Metodo che restituisce una mappa con in chiave la famiglia relativa alla tipologia di prodotto e come valore il numero di
	 * volte nelle quali quella famiglia è stata coltivata
	 * 
	 * @return Map<String, Long>
	 */
	Map<String, Long> countFamigliaOrtaggioColtura();
	
	/**
	 * Metodo che restituisce una mappa con in chiave la tipologia di prodotto e come valore un oggetto
	 * che ha le liste di prezzi e date raccolto relative a quel determinato prodotto
	 * 
	 * @return Map di ColturaListPrezzoDataRaccoltoDTO
	 */
	Map<String, ColturaListPrezzoDataRaccoltoDTO> findPrezziAndDateColtura();
}
