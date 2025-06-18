package com.agriflux.agrifluxshared.dto.terreno;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TerrenoMorfologiaColturaDTO {
	
	private String prodottoColtivato;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<LocalDateTime> dateRilevazione;
	private Long idColtura;
	
	public TerrenoMorfologiaColturaDTO(String prodottoColtivato, List<LocalDateTime> dateRilevazione, Long idColtura) {
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

	public List<LocalDateTime> getDateRilevazione() {
		return dateRilevazione;
	}

	public void setDateRilevazione(List<LocalDateTime> dateRilevazione) {
		this.dateRilevazione = dateRilevazione;
	}

	public Long getIdColtura() {
		return idColtura;
	}

	public void setIdColtura(Long idColtura) {
		this.idColtura = idColtura;
	}

}
