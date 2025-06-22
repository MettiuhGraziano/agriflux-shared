package com.agriflux.agrifluxshared.dto.produzione;

import java.math.BigDecimal;

public class ProduzioneColturaDTO {
	
	private BigDecimal quantitaRaccolto;
	private BigDecimal quantitaRaccoltoVenduto;
	private BigDecimal quantitaRaccoltoMarcio;
	private BigDecimal quantitaRaccoltoTerzi;
	private BigDecimal fatturatoRaccolto;
	
	public ProduzioneColturaDTO(BigDecimal quantitaRaccolto, BigDecimal quantitaRaccoltoVenduto,
			BigDecimal quantitaRaccoltoMarcio, BigDecimal quantitaRaccoltoTerzi, BigDecimal fatturatoRaccolto) {
		this.quantitaRaccolto = quantitaRaccolto;
		this.quantitaRaccoltoVenduto = quantitaRaccoltoVenduto;
		this.quantitaRaccoltoMarcio = quantitaRaccoltoMarcio;
		this.quantitaRaccoltoTerzi = quantitaRaccoltoTerzi;
		this.fatturatoRaccolto = fatturatoRaccolto;
	}
	
	public ProduzioneColturaDTO() {}

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
	
}
