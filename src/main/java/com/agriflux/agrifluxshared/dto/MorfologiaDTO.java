package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;

public class MorfologiaDTO {
	
	private long idMorfologia;
	private BigDecimal estensioneTerreno;
	private int pendenza;
	private String esposizione;
	private String litologia;
	
	public long getIdMorfologia() {
		return idMorfologia;
	}
	
	public void setIdMorfologia(long idMorfologia) {
		this.idMorfologia = idMorfologia;
	}
	
	public BigDecimal getEstensioneTerreno() {
		return estensioneTerreno;
	}
	
	public void setEstensioneTerreno(BigDecimal estensioneTerreno) {
		this.estensioneTerreno = estensioneTerreno;
	}
	
	public int getPendenza() {
		return pendenza;
	}
	
	public void setPendenza(int pendenza) {
		this.pendenza = pendenza;
	}
	
	public String getEsposizione() {
		return esposizione;
	}
	
	public void setEsposizione(String esposizione) {
		this.esposizione = esposizione;
	}
	
	public String getLitologia() {
		return litologia;
	}
	
	public void setLitologia(String litologia) {
		this.litologia = litologia;
	}
	
}
