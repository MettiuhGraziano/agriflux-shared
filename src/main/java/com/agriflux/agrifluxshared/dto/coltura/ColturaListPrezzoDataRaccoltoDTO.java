package com.agriflux.agrifluxshared.dto.coltura;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ColturaListPrezzoDataRaccoltoDTO {
	
	private List<BigDecimal> prezzoKgList;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<LocalDate> dataRaccoltoList;

	public ColturaListPrezzoDataRaccoltoDTO(List<BigDecimal> prezzoKgList, List<LocalDate> dataRaccoltoList) {
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

	public List<LocalDate> getDataRaccoltoList() {
		return dataRaccoltoList;
	}

	public void setDataRaccoltoList(List<LocalDate> dataRaccoltoList) {
		this.dataRaccoltoList = dataRaccoltoList;
	}
	
}
