package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;

public class ProduzioneColturaDTO {
	
	private BigDecimal quantitaRaccolto;
	private BigDecimal quantitaRaccoltoVenduto;
	private BigDecimal fatturatoColtura;
	
	public ProduzioneColturaDTO(BigDecimal quantitaRaccolto,
			BigDecimal quantitaRaccoltoVenduto, BigDecimal fatturatoColtura) {
		this.quantitaRaccolto = quantitaRaccolto;
		this.quantitaRaccoltoVenduto = quantitaRaccoltoVenduto;
		this.fatturatoColtura = fatturatoColtura;
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

	public BigDecimal getFatturatoColtura() {
		return fatturatoColtura;
	}

	public void setFatturatoColtura(BigDecimal fatturatoColtura) {
		this.fatturatoColtura = fatturatoColtura;
	}
	
}
