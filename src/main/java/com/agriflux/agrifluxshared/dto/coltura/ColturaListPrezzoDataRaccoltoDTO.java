package com.agriflux.agrifluxshared.dto.coltura;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ColturaListPrezzoDataRaccoltoDTO {
	
	private List<BigDecimal> prezzoKgList;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<LocalDateTime> dataRaccoltoList;

	public ColturaListPrezzoDataRaccoltoDTO(List<BigDecimal> prezzoKgList, List<LocalDateTime> dataRaccoltoList) {
		this.prezzoKgList = prezzoKgList;
		this.dataRaccoltoList = dataRaccoltoList;
	}
	
	public ColturaListPrezzoDataRaccoltoDTO() {}

	public List<BigDecimal> getPrezzoKgList() {
		return prezzoKgList;
	}

	public void setPrezzoKgList(List<BigDecimal> prezzoKgList) {
		this.prezzoKgList = prezzoKgList;
	}

	public List<LocalDateTime> getDataRaccoltoList() {
		return dataRaccoltoList;
	}

	public void setDataRaccoltoList(List<LocalDateTime> dataRaccoltoList) {
		this.dataRaccoltoList = dataRaccoltoList;
	}
	
}
