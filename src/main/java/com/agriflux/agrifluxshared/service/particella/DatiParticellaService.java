package com.agriflux.agrifluxshared.service.particella;

import java.util.List;

import com.agriflux.agrifluxshared.dto.particella.DatiParticellaDTO;

public interface DatiParticellaService {
	
	List<DatiParticellaDTO> findAllParticellaIdAnno();
}
