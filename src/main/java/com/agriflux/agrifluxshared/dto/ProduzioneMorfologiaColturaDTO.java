package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProduzioneMorfologiaColturaDTO {
	
	private String prodottoColtivato;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataRaccolto;
	private long idMorfologia;
	private BigDecimal estensioneTerreno;
	private BigDecimal pendenza;
	private String esposizione;
	private String litologia;
	
	public ProduzioneMorfologiaColturaDTO(String prodottoColtivato, Date dataRaccolto, long idMorfologia,
			BigDecimal estensioneTerreno, BigDecimal pendenza, String esposizione, String litologia) {
		this.prodottoColtivato = prodottoColtivato;
		this.dataRaccolto = dataRaccolto;
		this.idMorfologia = idMorfologia;
		this.estensioneTerreno = estensioneTerreno;
		this.pendenza = pendenza;
		this.esposizione = esposizione;
		this.litologia = litologia;
	}
	
	public ProduzioneMorfologiaColturaDTO() {}

	public String getProdottoColtivato() {
		return prodottoColtivato;
	}

	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}

	public Date getDataRaccolto() {
		return dataRaccolto;
	}

	public void setDataRaccolto(Date dataRaccolto) {
		this.dataRaccolto = dataRaccolto;
	}

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

	public BigDecimal getPendenza() {
		return pendenza;
	}

	public void setPendenza(BigDecimal pendenza) {
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
