package com.agriflux.agrifluxshared.dto.particella;

import java.math.BigDecimal;

public class DatiParticellaDTO {
	
	private long idParticella;
	
	private String comune;
	private String foglio;
	private String qualita;
	private String annoInstallazione;
	private String esposizione; 
	
	private BigDecimal costo;
	private BigDecimal estensione;
	private BigDecimal pendenza;
	
	private String tipologiaLitologia;
	
	public DatiParticellaDTO(long idParticella, String comune, String foglio, String qualita, String annoInstallazione,
			String esposizione, BigDecimal costo, BigDecimal estensione, BigDecimal pendenza, String tipologiaLitologia) {
		this.idParticella = idParticella;
		this.comune = comune;
		this.foglio = foglio;
		this.qualita = qualita;
		this.annoInstallazione = annoInstallazione;
		this.esposizione = esposizione;
		this.costo = costo;
		this.estensione = estensione;
		this.pendenza = pendenza;
		this.tipologiaLitologia = tipologiaLitologia;
	}

	public DatiParticellaDTO() {}

	public long getIdParticella() {
		return idParticella;
	}

	public void setIdParticella(long idParticella) {
		this.idParticella = idParticella;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getFoglio() {
		return foglio;
	}

	public void setFoglio(String foglio) {
		this.foglio = foglio;
	}

	public String getQualita() {
		return qualita;
	}

	public void setQualita(String qualita) {
		this.qualita = qualita;
	}

	public String getAnnoInstallazione() {
		return annoInstallazione;
	}

	public void setAnnoInstallazione(String annoInstallazione) {
		this.annoInstallazione = annoInstallazione;
	}

	public String getEsposizione() {
		return esposizione;
	}

	public void setEsposizione(String esposizione) {
		this.esposizione = esposizione;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public BigDecimal getEstensione() {
		return estensione;
	}

	public void setEstensione(BigDecimal estensione) {
		this.estensione = estensione;
	}

	public BigDecimal getPendenza() {
		return pendenza;
	}

	public void setPendenza(BigDecimal pendenza) {
		this.pendenza = pendenza;
	}

	public String getTipologiaLitologia() {
		return tipologiaLitologia;
	}

	public void setTipologiaLitologia(String tipologiaLitologia) {
		this.tipologiaLitologia = tipologiaLitologia;
	}

}
