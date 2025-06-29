package com.agriflux.agrifluxshared.service.produzione;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.produzione.ProduzioneColturaDTO;
import com.agriflux.agrifluxshared.dto.produzione.ProduzioneColturaTempiDTO;
import com.agriflux.agrifluxshared.dto.produzione.ProduzioneDTO;
import com.agriflux.agrifluxshared.dto.produzione.ProduzioneParticellaColturaOrtaggioDTO;

public interface DatiProduzioneService {
	
	/**
	 * Metodo che restituisce la lista di dati di Produzione ordinati in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di ProduzioneDTO
	 */
	List<ProduzioneDTO> findAllProduzioneSortById();
	
	/**
	 * Metodo che restituisce una mappa con chiave la tipologia di prodotto e come valore un'altra mappa con chiave
	 * l'anno di riferimento e come valore un oggetto contenente i dati sulla quantita' del raccolto ed il fatturato
	 * relativo a quell'anno
	 * 
	 * @return Map -> key : Prodotto | value : Map -> key : Anno Riferimento | value : {@code ProduzioneColturaDTO}
	 */
	Map<String, Map<String, ProduzioneColturaDTO>> findProduzioneQuantitaJoinColtura();
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'anno di semina e come valore una lista di oggetti
	 * contenenti il prodotto coltivato e la lista delle medie dei tempi dalla semina alla raccolta per il 
	 * singolo prodotto
	 * 
	 * @return Map di ProduzioneColturaTempiDTO
	 */
	Map<String, List<ProduzioneColturaTempiDTO>> findProduzioneJoinColturaTempi();
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'id della produzione e come valore un oggetto
	 * che contiene i dati relativi alla morfologia del terreno e l'id della coltura con la data di semina 
	 * 
	 * @return Map di ProduzioneMorfologiaColturaDTO
	 */
	Map<Long, ProduzioneParticellaColturaOrtaggioDTO> findProduzioneParticellaColturaOrtaggio();
}
