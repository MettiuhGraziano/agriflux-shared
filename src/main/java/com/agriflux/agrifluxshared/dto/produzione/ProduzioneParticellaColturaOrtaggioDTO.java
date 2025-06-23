package com.agriflux.agrifluxshared.dto.produzione;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProduzioneParticellaColturaOrtaggioDTO {
	
	private String prodottoColtivato;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dataRaccolto;
	private long idParticella;
	private BigDecimal estensioneTerreno;
	private BigDecimal pendenza;
	private String esposizione;
	private String litologia;
	
	public ProduzioneParticellaColturaOrtaggioDTO(String prodottoColtivato, LocalDate dataRaccolto, long idParticella,
			BigDecimal estensioneTerreno, BigDecimal pendenza, String esposizione, String litologia) {
		this.prodottoColtivato = prodottoColtivato;
		this.dataRaccolto = dataRaccolto;
		this.idParticella = idParticella;
		this.estensioneTerreno = estensioneTerreno;
		this.pendenza = pendenza;
		this.esposizione = esposizione;
		this.litologia = litologia;
	}
	
	public ProduzioneParticellaColturaOrtaggioDTO() {}

	public String getProdottoColtivato() {
		return prodottoColtivato;
	}

	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}

	public LocalDate getDataRaccolto() {
		return dataRaccolto;
	}

	public void setDataRaccolto(LocalDate dataRaccolto) {
		this.dataRaccolto = dataRaccolto;
	}

	public long getIdParticella() {
		return idParticella;
	}

	public void setIdParticella(long idParticella) {
		this.idParticella = idParticella;
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
