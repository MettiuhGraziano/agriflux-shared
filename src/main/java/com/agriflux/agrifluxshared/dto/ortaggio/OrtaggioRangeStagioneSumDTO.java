package com.agriflux.agrifluxshared.dto.ortaggio;

import java.math.BigDecimal;

public class OrtaggioRangeStagioneSumDTO {
	
	private long idOrtaggio;
	
	private int giorniSeminaRaccolto;
	
	private BigDecimal pesoMedio;
	private BigDecimal volumeMq;
	
	private String meseSeminaMin;
	private String meseSeminaMax;
	
	public OrtaggioRangeStagioneSumDTO() {}

	public OrtaggioRangeStagioneSumDTO(long idOrtaggio, int giorniSeminaRaccolto, BigDecimal pesoMedio,
			BigDecimal volumeMq, String meseSeminaMin, String meseSeminaMax) {
		this.idOrtaggio = idOrtaggio;
		this.giorniSeminaRaccolto = giorniSeminaRaccolto;
		this.pesoMedio = pesoMedio;
		this.volumeMq = volumeMq;
		this.meseSeminaMin = meseSeminaMin;
		this.meseSeminaMax = meseSeminaMax;
	}

	public long getIdOrtaggio() {
		return idOrtaggio;
	}

	public void setIdOrtaggio(long idOrtaggio) {
		this.idOrtaggio = idOrtaggio;
	}

	public int getGiorniSeminaRaccolto() {
		return giorniSeminaRaccolto;
	}

	public void setGiorniSeminaRaccolto(int giorniSeminaRaccolto) {
		this.giorniSeminaRaccolto = giorniSeminaRaccolto;
	}

	public BigDecimal getPesoMedio() {
		return pesoMedio;
	}

	public void setPesoMedio(BigDecimal pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

	public BigDecimal getVolumeMq() {
		return volumeMq;
	}

	public void setVolumeMq(BigDecimal volumeMq) {
		this.volumeMq = volumeMq;
	}

	public String getMeseSeminaMin() {
		return meseSeminaMin;
	}

	public void setMeseSeminaMin(String meseSeminaMin) {
		this.meseSeminaMin = meseSeminaMin;
	}

	public String getMeseSeminaMax() {
		return meseSeminaMax;
	}

	public void setMeseSeminaMax(String meseSeminaMax) {
		this.meseSeminaMax = meseSeminaMax;
	}
	
}
