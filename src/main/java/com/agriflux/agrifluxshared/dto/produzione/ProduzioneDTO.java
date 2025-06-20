package com.agriflux.agrifluxshared.dto.produzione;

import java.math.BigDecimal;

public class ProduzioneDTO {
	
	private long idProduzione;
	
	private BigDecimal quantitaRaccolto;
	private BigDecimal quantitaRaccoltoVenduto;
	private BigDecimal quantitaRaccoltoMarcio;
	private BigDecimal quantitaRaccoltoTerzi;
	private BigDecimal fatturatoRaccolto;
	
	private int numLavoratori;
	
	private BigDecimal speseProduzione;
	
	private long idColtura;

	public ProduzioneDTO(long idProduzione, BigDecimal quantitaRaccolto, BigDecimal quantitaRaccoltoVenduto,
			BigDecimal quantitaRaccoltoMarcio, BigDecimal quantitaRaccoltoTerzi, BigDecimal fatturatoRaccolto,
			int numLavoratori, BigDecimal speseProduzione, long idColtura) {
		this.idProduzione = idProduzione;
		this.quantitaRaccolto = quantitaRaccolto;
		this.quantitaRaccoltoVenduto = quantitaRaccoltoVenduto;
		this.quantitaRaccoltoMarcio = quantitaRaccoltoMarcio;
		this.quantitaRaccoltoTerzi = quantitaRaccoltoTerzi;
		this.fatturatoRaccolto = fatturatoRaccolto;
		this.numLavoratori = numLavoratori;
		this.speseProduzione = speseProduzione;
		this.idColtura = idColtura;
	}
	
	ProduzioneDTO() {}

	public long getIdProduzione() {
		return idProduzione;
	}

	public void setIdProduzione(long idProduzione) {
		this.idProduzione = idProduzione;
	}

	public BigDecimal getQuantitaRaccolto() {
		return quantitaRaccolto;
	}

	public void setQuantitaRaccolto(BigDecimal quantitaRaccolto) {
		this.quantitaRaccolto = quantitaRaccolto;
	}

	public BigDecimal getQuantitaRaccoltoVenduto() {
		return quantitaRaccoltoVenduto;
	}

	public void setQuantitaRaccoltoVenduto(BigDecimal quantitaRaccoltoVenduto) {
		this.quantitaRaccoltoVenduto = quantitaRaccoltoVenduto;
	}

	public BigDecimal getQuantitaRaccoltoMarcio() {
		return quantitaRaccoltoMarcio;
	}

	public void setQuantitaRaccoltoMarcio(BigDecimal quantitaRaccoltoMarcio) {
		this.quantitaRaccoltoMarcio = quantitaRaccoltoMarcio;
	}

	public BigDecimal getQuantitaRaccoltoTerzi() {
		return quantitaRaccoltoTerzi;
	}

	public void setQuantitaRaccoltoTerzi(BigDecimal quantitaRaccoltoTerzi) {
		this.quantitaRaccoltoTerzi = quantitaRaccoltoTerzi;
	}

	public BigDecimal getFatturatoRaccolto() {
		return fatturatoRaccolto;
	}

	public void setFatturatoRaccolto(BigDecimal fatturatoRaccolto) {
		this.fatturatoRaccolto = fatturatoRaccolto;
	}

	public int getNumLavoratori() {
		return numLavoratori;
	}

	public void setNumLavoratori(int numLavoratori) {
		this.numLavoratori = numLavoratori;
	}

	public BigDecimal getSpeseProduzione() {
		return speseProduzione;
	}

	public void setSpeseProduzione(BigDecimal speseProduzione) {
		this.speseProduzione = speseProduzione;
	}

	public long getIdColtura() {
		return idColtura;
	}

	public void setIdColtura(long idColtura) {
		this.idColtura = idColtura;
	}
	
}
