package com.agriflux.agrifluxshared.dto.terreno;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TerrenoDTO {
	
	private long idRilevazioneTerreno;
	private BigDecimal phSuolo;
	private BigDecimal umidita;
	private BigDecimal capacitaAssorbente;
	private BigDecimal porosita;
	private BigDecimal temperatura;
	private LocalDate dataRilevazione;
	private long idParticellaParticella;
	
	TerrenoDTO() {}
	
	public long getIdRilevazioneTerreno() {
		return idRilevazioneTerreno;
	}
	
	public void setIdRilevazioneTerreno(long idRilevazioneTerreno) {
		this.idRilevazioneTerreno = idRilevazioneTerreno;
	}
	
	public BigDecimal getPhSuolo() {
		return phSuolo;
	}
	
	public void setPhSuolo(BigDecimal phSuolo) {
		this.phSuolo = phSuolo;
	}
	
	public BigDecimal getUmidita() {
		return umidita;
	}
	
	public void setUmidita(BigDecimal umidita) {
		this.umidita = umidita;
	}
	
	public BigDecimal getCapacitaAssorbente() {
		return capacitaAssorbente;
	}
	
	public void setCapacitaAssorbente(BigDecimal capacitaAssorbente) {
		this.capacitaAssorbente = capacitaAssorbente;
	}
	
	public BigDecimal getPorosita() {
		return porosita;
	}
	
	public void setPorosita(BigDecimal porosita) {
		this.porosita = porosita;
	}
	
	public BigDecimal getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(BigDecimal temperatura) {
		this.temperatura = temperatura;
	}
	
	public LocalDate getDataRilevazione() {
		return dataRilevazione;
	}
	
	public void setDataRilevazione(LocalDate dataRilevazione) {
		this.dataRilevazione = dataRilevazione;
	}

	public long getIdParticellaParticella() {
		return idParticellaParticella;
	}

	public void setIdParticellaParticella(long idParticellaParticella) {
		this.idParticellaParticella = idParticellaParticella;
	}

}
