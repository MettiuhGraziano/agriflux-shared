package com.agriflux.agrifluxshared.dto.produzione;

import java.math.BigDecimal;

public class ProduzioneJoinColturaFatturatoDTO {
	
	private BigDecimal fatturatoRaccolto;
	private BigDecimal speseProduzione;
	
	public ProduzioneJoinColturaFatturatoDTO(BigDecimal fatturatoRaccolto, BigDecimal speseProduzione) {
		this.fatturatoRaccolto = fatturatoRaccolto;
		this.speseProduzione = speseProduzione;
	}
	
	public ProduzioneJoinColturaFatturatoDTO() {}

	public BigDecimal getFatturatoRaccolto() {
		return fatturatoRaccolto;
	}

	public void setFatturatoRaccolto(BigDecimal fatturatoRaccolto) {
		this.fatturatoRaccolto = fatturatoRaccolto;
	}

	public BigDecimal getSpeseProduzione() {
		return speseProduzione;
	}

	public void setSpeseProduzione(BigDecimal speseProduzione) {
		this.speseProduzione = speseProduzione;
	}
	
}
