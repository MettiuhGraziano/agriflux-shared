package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;
import java.util.Date;

public class TerrenoDTO {
	
	private long idRilevazioneTerreno;
	private BigDecimal phSuolo;
	private BigDecimal umidita;
	private BigDecimal capacitaAssorbente;
	private BigDecimal porosita;
	private BigDecimal temperatura;
	private int disponibilitaIrrigua;
	private Date dataRilevazione;
	private long idColtura;
	private long idMorfologia;
	
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
	
	public int getDisponibilitaIrrigua() {
		return disponibilitaIrrigua;
	}
	
	public void setDisponibilitaIrrigua(int disponibilitaIrrigua) {
		this.disponibilitaIrrigua = disponibilitaIrrigua;
	}
	
	public Date getDataRilevazione() {
		return dataRilevazione;
	}
	
	public void setDataRilevazione(Date dataRilevazione) {
		this.dataRilevazione = dataRilevazione;
	}
	
	public long getIdColtura() {
		return idColtura;
	}
	
	public void setIdColtura(long idColtura) {
		this.idColtura = idColtura;
	}
	
	public long getIdMorfologia() {
		return idMorfologia;
	}
	
	public void setIdMorfologia(long idMorfologia) {
		this.idMorfologia = idMorfologia;
	}
	
}
