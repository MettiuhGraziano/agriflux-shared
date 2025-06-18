package com.agriflux.agrifluxshared.service;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.AmbienteDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneColturaDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneColturaTempiDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneDTO;
import com.agriflux.agrifluxshared.dto.ProduzioneMorfologiaColturaDTO;
import com.agriflux.agrifluxshared.dto.coltura.ColturaDTO;
import com.agriflux.agrifluxshared.dto.coltura.ColturaGroupByProdottoDTO;
import com.agriflux.agrifluxshared.dto.coltura.ColturaListPrezzoDataRaccoltoDTO;
import com.agriflux.agrifluxshared.dto.terreno.TerrenoDTO;
import com.agriflux.agrifluxshared.dto.terreno.TerrenoMorfologiaColturaDTO;

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
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'anno di semina e come valore una lista di oggetti
	 * contenenti il prodotto coltivato e la lista delle medie dei tempi dalla semina alla raccolta per il 
	 * singolo prodotto
	 * 
	 * @return Map di ProduzioneColturaTempiDTO
	 */
	Map<String, List<ProduzioneColturaTempiDTO>> findProduzioneTempiJoinColtura();
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'id della produzione e come valore un oggetto
	 * che contiene i dati relativi alla morfologia del terreno e l'id della coltura con la data di semina 
	 * 
	 * @return Map di ProduzioneMorfologiaColturaDTO
	 */
	Map<Long, ProduzioneMorfologiaColturaDTO> findProduzioneJoinColturaMorfologia();
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'id della rilevazione morfologica e come valore 
	 * una lista di oggetti contenenti il prodotto coltivato e la lista di date rilevazione del terreno 
	 * 
	 * @return Map di TerrenoMorfologiaColturaDTO
	 */
	Map<Long, List<TerrenoMorfologiaColturaDTO>> findTerrenoJoinColturaMorfologia();
}
