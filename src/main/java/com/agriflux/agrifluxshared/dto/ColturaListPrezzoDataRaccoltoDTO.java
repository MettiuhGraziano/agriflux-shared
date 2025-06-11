package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ColturaListPrezzoDataRaccoltoDTO {
	
	private List<BigDecimal> prezzoKgList;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<Date> dataRaccoltoList;

	public ColturaListPrezzoDataRaccoltoDTO(List<BigDecimal> prezzoKgList, List<Date> dataRaccoltoList) {
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

	public List<Date> getDataRaccoltoList() {
		return dataRaccoltoList;
	}

	public void setDataRaccoltoList(List<Date> dataRaccoltoList) {
		this.dataRaccoltoList = dataRaccoltoList;
	}
	
}
