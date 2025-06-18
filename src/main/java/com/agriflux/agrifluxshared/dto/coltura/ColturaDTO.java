package com.agriflux.agrifluxshared.dto.coltura;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ColturaDTO {
	
	private long idColtura;
	private String prodottoColtivato;
	private BigDecimal prezzoKg;
	private LocalDateTime dataSemina;
	private LocalDateTime dataRaccolto;
	
	public long getIdColtura() {
		return idColtura;
	}
	
	public void setIdColtura(long idColtura) {
		this.idColtura = idColtura;
	}
	
	public String getProdottoColtivato() {
		return prodottoColtivato;
	}
	
	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}
	
	public BigDecimal getPrezzoKg() {
		return prezzoKg;
	}
	
	public void setPrezzoKg(BigDecimal prezzoKg) {
		this.prezzoKg = prezzoKg;
	}
	
	public LocalDateTime getDataSemina() {
		return dataSemina;
	}
	
	public void setDataSemina(LocalDateTime dataSemina) {
		this.dataSemina = dataSemina;
	}
	
	public LocalDateTime getDataRaccolto() {
		return dataRaccolto;
	}
	
	public void setDataRaccolto(LocalDateTime dataRaccolto) {
		this.dataRaccolto = dataRaccolto;
	}
}
