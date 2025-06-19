package com.agriflux.agrifluxshared.service.ortaggio;

import java.util.List;

import com.agriflux.agrifluxshared.dto.ortaggio.OrtaggioDTO;
import com.agriflux.agrifluxshared.dto.ortaggio.OrtaggioRangeStagioneSumDTO;

public interface DatiOrtaggioService {
	
	List<OrtaggioDTO> findAllOrtaggioSortById();
	
	List<OrtaggioRangeStagioneSumDTO> findAllOrtaggioRangeStagione();
}
