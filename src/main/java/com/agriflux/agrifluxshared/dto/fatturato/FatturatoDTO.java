package com.agriflux.agrifluxshared.dto.fatturato;

import java.math.BigDecimal;

public class FatturatoDTO {
	
	private long idFatturato;
	
	private String annoRiferimento;
	
	private BigDecimal ricaviVendita;
	private BigDecimal speseGenerali;
	private BigDecimal interessiAttivi;
	private BigDecimal interessiPassivi;
	
	private long idParticellaParticella;

	public FatturatoDTO(long idFatturato, String annoRiferimento, BigDecimal ricaviVendita, BigDecimal speseGenerali,
			BigDecimal interessiAttivi, BigDecimal interessiPassivi, long idParticellaParticella) {
		this.idFatturato = idFatturato;
		this.annoRiferimento = annoRiferimento;
		this.ricaviVendita = ricaviVendita;
		this.speseGenerali = speseGenerali;
		this.interessiAttivi = interessiAttivi;
		this.interessiPassivi = interessiPassivi;
		this.idParticellaParticella = idParticellaParticella;
	}
	
	public FatturatoDTO() {}

	public long getIdFatturato() {
		return idFatturato;
	}

	public void setIdFatturato(long idFatturato) {
		this.idFatturato = idFatturato;
	}

	public String getAnnoRiferimento() {
		return annoRiferimento;
	}

	public void setAnnoRiferimento(String annoRiferimento) {
		this.annoRiferimento = annoRiferimento;
	}

	public BigDecimal getRicaviVendita() {
		return ricaviVendita;
	}

	public void setRicaviVendita(BigDecimal ricaviVendita) {
		this.ricaviVendita = ricaviVendita;
	}

	public BigDecimal getSpeseGenerali() {
		return speseGenerali;
	}

	public void setSpeseGenerali(BigDecimal speseGenerali) {
		this.speseGenerali = speseGenerali;
	}

	public BigDecimal getInteressiAttivi() {
		return interessiAttivi;
	}

	public void setInteressiAttivi(BigDecimal interessiAttivi) {
		this.interessiAttivi = interessiAttivi;
	}

	public BigDecimal getInteressiPassivi() {
		return interessiPassivi;
	}

	public void setInteressiPassivi(BigDecimal interessiPassivi) {
		this.interessiPassivi = interessiPassivi;
	}

	public long getIdParticellaParticella() {
		return idParticellaParticella;
	}

	public void setIdParticellaParticella(long idParticellaParticella) {
		this.idParticellaParticella = idParticellaParticella;
	}
	
}
