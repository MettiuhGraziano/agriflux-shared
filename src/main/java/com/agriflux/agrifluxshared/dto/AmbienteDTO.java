package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AmbienteDTO {
	
	private long idAmbiente;
	private BigDecimal temperaturaMedia;
	private BigDecimal umiditaMedia;
	private BigDecimal precipitazioni;
	private BigDecimal irraggiamentoMedio;
	private BigDecimal ombreggiamentoMedio;
	private Date dataRilevazione;
	private long idColtura;
	
	public long getIdAmbiente() {
		return idAmbiente;
	}
	
	public void setIdAmbiente(long idAmbiente) {
		this.idAmbiente = idAmbiente;
	}
	
	public BigDecimal getTemperaturaMedia() {
		return temperaturaMedia;
	}
	
	public void setTemperaturaMedia(BigDecimal temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	
	public BigDecimal getUmiditaMedia() {
		return umiditaMedia;
	}
	
	public void setUmiditaMedia(BigDecimal umiditaMedia) {
		this.umiditaMedia = umiditaMedia;
	}
	
	public BigDecimal getPrecipitazioni() {
		return precipitazioni;
	}
	
	public void setPrecipitazioni(BigDecimal precipitazioni) {
		this.precipitazioni = precipitazioni;
	}
	
	public BigDecimal getIrraggiamentoMedio() {
		return irraggiamentoMedio;
	}
	
	public void setIrraggiamentoMedio(BigDecimal irraggiamentoMedio) {
		this.irraggiamentoMedio = irraggiamentoMedio;
	}
	
	public BigDecimal getOmbreggiamentoMedio() {
		return ombreggiamentoMedio;
	}
	
	public void setOmbreggiamentoMedio(BigDecimal ombreggiamentoMedio) {
		this.ombreggiamentoMedio = ombreggiamentoMedio;
	}
	
	public Date getDataRilevazione() {
		return dataRilevazione;
	}
	
	public void setDataRilevazione(Date dataRilevazione) {
		this.dataRilevazione = dataRilevazione;
	}
	
	public long getIdColtura() {
		return idColtura;
	}
	
	public void setIdColtura(long idColtura) {
		this.idColtura = idColtura;
	}
	
}
