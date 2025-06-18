package com.agriflux.agrifluxshared.dto.ortaggio;

import java.math.BigDecimal;

public class OrtaggioDTO {
	
	private long idOrtaggio;
	
	private String nome;
	private String descrizione;
	private int giorniSemina;
	private int giorniGerminazione;
	private int giorniTrapianto;
	private int giorniMaturazione;
	private int giorniRaccolta;
	
	private BigDecimal pesoMedio;
	private BigDecimal volumeMq;
	
	private long idFamiglia;
	private long idRangeStagione;
	
	public OrtaggioDTO() {}
	
	public long getIdOrtaggio() {
		return idOrtaggio;
	}
	
	public void setIdOrtaggio(long idOrtaggio) {
		this.idOrtaggio = idOrtaggio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public int getGiorniSemina() {
		return giorniSemina;
	}
	
	public void setGiorniSemina(int giorniSemina) {
		this.giorniSemina = giorniSemina;
	}
	
	public int getGiorniGerminazione() {
		return giorniGerminazione;
	}
	
	public void setGiorniGerminazione(int giorniGerminazione) {
		this.giorniGerminazione = giorniGerminazione;
	}
	
	public int getGiorniTrapianto() {
		return giorniTrapianto;
	}
	
	public void setGiorniTrapianto(int giorniTrapianto) {
		this.giorniTrapianto = giorniTrapianto;
	}
	
	public int getGiorniMaturazione() {
		return giorniMaturazione;
	}
	
	public void setGiorniMaturazione(int giorniMaturazione) {
		this.giorniMaturazione = giorniMaturazione;
	}
	
	public int getGiorniRaccolta() {
		return giorniRaccolta;
	}
	
	public void setGiorniRaccolta(int giorniRaccolta) {
		this.giorniRaccolta = giorniRaccolta;
	}
	
	public BigDecimal getPesoMedio() {
		return pesoMedio;
	}
	
	public void setPesoMedio(BigDecimal pesoMedio) {
		this.pesoMedio = pesoMedio;
	}
	
	public BigDecimal getVolumeMq() {
		return volumeMq;
	}
	
	public void setVolumeMq(BigDecimal volumeMq) {
		this.volumeMq = volumeMq;
	}
	
	public long getIdFamiglia() {
		return idFamiglia;
	}
	
	public void setIdFamiglia(long idFamiglia) {
		this.idFamiglia = idFamiglia;
	}
	
	public long getIdRangeStagione() {
		return idRangeStagione;
	}
	
	public void setIdRangeStagione(long idRangeStagione) {
		this.idRangeStagione = idRangeStagione;
	}
	
}
