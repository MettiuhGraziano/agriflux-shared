package com.agriflux.agrifluxshared.service.datoEconomico;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface DatoEconomicoService {
	
	Map<Long, List<Map<Integer, BigDecimal>>> findDatoEconomicoOrtaggio();
}
