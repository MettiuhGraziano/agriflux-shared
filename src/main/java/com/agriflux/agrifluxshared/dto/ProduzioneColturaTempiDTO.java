package com.agriflux.agrifluxshared.dto;

import java.util.List;

public class ProduzioneColturaTempiDTO {
	
	private String prodottoColtivato;
	private List<Double> listMedieTempi;
	
	public ProduzioneColturaTempiDTO(String prodottoColtivato, List<Double> listMedieTempi) {
		this.prodottoColtivato = prodottoColtivato;
		this.listMedieTempi = listMedieTempi;
	}
	
	public ProduzioneColturaTempiDTO() {};

	public String getProdottoColtivato() {
		return prodottoColtivato;
	}

	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}

	public List<Double> getListMedieTempi() {
		return listMedieTempi;
	}

	public void setListMedieTempi(List<Double> listMedieTempi) {
		this.listMedieTempi = listMedieTempi;
	}
	
}
