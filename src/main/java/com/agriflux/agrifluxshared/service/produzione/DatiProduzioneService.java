package com.agriflux.agrifluxshared.service.produzione;

import java.util.List;
import java.util.Map;

import com.agriflux.agrifluxshared.dto.produzione.ProduzioneJoinColturaFatturatoDTO;

public interface DatiProduzioneService {
	
	Map<Long, List<Map<Integer, ProduzioneJoinColturaFatturatoDTO>>> findProduzioneJoinColturaFatturato();
}
