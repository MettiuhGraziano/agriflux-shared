package com.agriflux.agrifluxshared.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TerrenoMorfologiaColturaDTO {
	
	private String prodottoColtivato;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<Date> dateRilevazione;
	private Long idColtura;
	
	public TerrenoMorfologiaColturaDTO(String prodottoColtivato, List<Date> dateRilevazione, Long idColtura) {
		this.prodottoColtivato = prodottoColtivato;
		this.dateRilevazione = dateRilevazione;
		this.idColtura = idColtura;
	}
	
	public TerrenoMorfologiaColturaDTO() {}

	public String getProdottoColtivato() {
		return prodottoColtivato;
	}

	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}

	public List<Date> getDateRilevazione() {
		return dateRilevazione;
	}

	public void setDateRilevazione(List<Date> dateRilevazione) {
		this.dateRilevazione = dateRilevazione;
	}

	public Long getIdColtura() {
		return idColtura;
	}

	public void setIdColtura(Long idColtura) {
		this.idColtura = idColtura;
	}

}
