package com.agriflux.agrifluxshared.dto;

import java.math.BigDecimal;

public class ProduzioneDTO {
	
	private long idProduzione;
	private BigDecimal quantitaRaccolto;
	private BigDecimal quantitaRaccoltoVenduto;
	private BigDecimal fatturatoColtura;
	private BigDecimal speseAccessorie;
	private int numLavoratori;
	private int tempoSemina; 
	private int tempoGerminazione;
	private int tempoTrapianto;
	private int tempoMaturazione;
	private int tempoRaccolta; 
	private long idColtura;
	private long idMorfologia;
	
	public long getIdProduzione() {
		return idProduzione;
	}
	
	public void setIdProduzione(long idProduzione) {
		this.idProduzione = idProduzione;
	}
	
	public BigDecimal getQuantitaRaccolto() {
		return quantitaRaccolto;
	}
	
	public void setQuantitaRaccolto(BigDecimal quantitaRaccolto) {
		this.quantitaRaccolto = quantitaRaccolto;
	}
	
	public BigDecimal getQuantitaRaccoltoVenduto() {
		return quantitaRaccoltoVenduto;
	}
	
	public void setQuantitaRaccoltoVenduto(BigDecimal quantitaRaccoltoVenduto) {
		this.quantitaRaccoltoVenduto = quantitaRaccoltoVenduto;
	}
	
	public BigDecimal getFatturatoColtura() {
		return fatturatoColtura;
	}
	
	public void setFatturatoColtura(BigDecimal fatturatoColtura) {
		this.fatturatoColtura = fatturatoColtura;
	}
	
	public BigDecimal getSpeseAccessorie() {
		return speseAccessorie;
	}
	
	public void setSpeseAccessorie(BigDecimal speseAccessorie) {
		this.speseAccessorie = speseAccessorie;
	}
	
	public int getNumLavoratori() {
		return numLavoratori;
	}
	
	public void setNumLavoratori(int numLavoratori) {
		this.numLavoratori = numLavoratori;
	}
	
	public int getTempoSemina() {
		return tempoSemina;
	}
	
	public void setTempoSemina(int tempoSemina) {
		this.tempoSemina = tempoSemina;
	}
	
	public int getTempoGerminazione() {
		return tempoGerminazione;
	}
	
	public void setTempoGerminazione(int tempoGerminazione) {
		this.tempoGerminazione = tempoGerminazione;
	}
	
	public int getTempoTrapianto() {
		return tempoTrapianto;
	}
	
	public void setTempoTrapianto(int tempoTrapianto) {
		this.tempoTrapianto = tempoTrapianto;
	}
	
	public int getTempoMaturazione() {
		return tempoMaturazione;
	}
	
	public void setTempoMaturazione(int tempoMaturazione) {
		this.tempoMaturazione = tempoMaturazione;
	}
	
	public int getTempoRaccolta() {
		return tempoRaccolta;
	}
	
	public void setTempoRaccolta(int tempoRaccolta) {
		this.tempoRaccolta = tempoRaccolta;
	}
	
	public long getIdColtura() {
		return idColtura;
	}
	
	public void setIdColtura(long idColtura) {
		this.idColtura = idColtura;
	}
	
	public long getIdMorfologia() {
		return idMorfologia;
	}
	
	public void setIdMorfologia(long idMorfologia) {
		this.idMorfologia = idMorfologia;
	}
	
}
