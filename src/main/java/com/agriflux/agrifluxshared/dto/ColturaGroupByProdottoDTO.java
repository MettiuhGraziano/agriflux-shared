package com.agriflux.agrifluxshared.dto;

public class ColturaGroupByProdottoDTO {
	
	private String prodottoColtivato;
	private long count;
	
	public ColturaGroupByProdottoDTO(String prodottoColtivato, long count) {
		this.prodottoColtivato = prodottoColtivato;
		this.count = count;
	}
	
	public ColturaGroupByProdottoDTO() {
		
	}
	
	public String getProdottoColtivato() {
		return prodottoColtivato;
	}
	
	public void setProdottoColtivato(String prodottoColtivato) {
		this.prodottoColtivato = prodottoColtivato;
	}
	
	public long getCount() {
		return count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
}
