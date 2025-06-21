package com.agriflux.agrifluxshared.service.particella;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.particella.DatiParticellaDTO;
import com.agriflux.agrifluxshared.dto.terreno.ParticellaColturaTerrenoDTO;

public interface DatiParticellaService {
	
	/**
	 * Metodo che restituisce la lista di Particelle ordinate in modo ASCENDENTE tramite l'ID
	 * 
	 * @return List di DatiParticellaDTO
	 */
	List<DatiParticellaDTO> findAllParticellaSortById();
	
	
	/**
	 * Metodo che restituisce una mappa con in chiave l'id della Particella e come valore 
	 * una lista di oggetti contenenti il prodotto coltivato, l'id della Coltura e la lista di date rilevazione del terreno 
	 * 
	 * @return Map<Long, List<ParticellaColturaTerreno>>
	 */
	Map<Long, List<ParticellaColturaTerrenoDTO>> findParticellaJoinColturaTerreno();
}
