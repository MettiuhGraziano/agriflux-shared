package com.agriflux.agrifluxshared.dto.ambiente;

import java.math.BigDecimal;
import java.time.LocalDate;

public class VariazioneValoriParametriAmbienteDTO {
	
	private BigDecimal valoreParametro;
	private LocalDate dataRilevazione;
	private BigDecimal variazionePercentuale;
	
	public VariazioneValoriParametriAmbienteDTO(BigDecimal valoreParametro, LocalDate dataRilevazione,
			BigDecimal variazionePercentuale) {
		this.valoreParametro = valoreParametro;
		this.dataRilevazione = dataRilevazione;
		this.variazionePercentuale = variazionePercentuale;
	}
	
	public VariazioneValoriParametriAmbienteDTO() {}

	public BigDecimal getValoreParametro() {
		return valoreParametro;
	}

	public void setValoreParametro(BigDecimal valoreParametro) {
		this.valoreParametro = valoreParametro;
	}

	public LocalDate getDataRilevazione() {
		return dataRilevazione;
	}

	public void setDataRilevazione(LocalDate dataRilevazione) {
		this.dataRilevazione = dataRilevazione;
	}

	public BigDecimal getVariazionePercentuale() {
		return variazionePercentuale;
	}

	public void setVariazionePercentuale(BigDecimal variazionePercentuale) {
		this.variazionePercentuale = variazionePercentuale;
	}
	
}
