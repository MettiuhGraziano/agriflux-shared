package com.agriflux.agrifluxshared.dto.ortaggio;

import java.math.BigDecimal;

public class OrtaggioRangeStagioneDTO {
	
	private long idOrtaggio;
	
	private int giorniSemina;
	private int giorniGerminazione;
	private int giorniTrapianto;
	private int giorniMaturazione;
	private int giorniRaccolta;
	
	private BigDecimal pesoMedio;
	private BigDecimal volumeMq;
	
	private String meseSeminaMin;
	private String meseSeminaMax;
	
	OrtaggioRangeStagioneDTO() {}
	
	public long getIdOrtaggio() {
		return idOrtaggio;
	}
	
	public void setIdOrtaggio(long idOrtaggio) {
		this.idOrtaggio = idOrtaggio;
	}
	
	public int getGiorniSemina() {
		return giorniSemina;
	}
	
	public void setGiorniSemina(int giorniSemina) {
		this.giorniSemina = giorniSemina;
	}
	
	public int getGiorniGerminazione() {
		return giorniGerminazione;
	}
	
	public void setGiorniGerminazione(int giorniGerminazione) {
		this.giorniGerminazione = giorniGerminazione;
	}
	
	public int getGiorniTrapianto() {
		return giorniTrapianto;
	}
	
	public void setGiorniTrapianto(int giorniTrapianto) {
		this.giorniTrapianto = giorniTrapianto;
	}
	
	public int getGiorniMaturazione() {
		return giorniMaturazione;
	}
	public void setGiorniMaturazione(int giorniMaturazione) {
		this.giorniMaturazione = giorniMaturazione;
	}
	public int getGiorniRaccolta() {
		return giorniRaccolta;
	}
	public void setGiorniRaccolta(int giorniRaccolta) {
		this.giorniRaccolta = giorniRaccolta;
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
