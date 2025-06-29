package com.agriflux.agrifluxshared.dto.azienda;

public class AziendaDTO {
	
	private String ragioneSociale;
	private String annoFondazione;
	private String tipologia;
	private String ateco;
	
	private long numDipendenti;

	public AziendaDTO(String ragioneSociale, String annoFondazione, String tipologia, String ateco,
			long numDipendenti) {
		this.ragioneSociale = ragioneSociale;
		this.annoFondazione = annoFondazione;
		this.tipologia = tipologia;
		this.ateco = ateco;
		this.numDipendenti = numDipendenti;
	}
	
	public AziendaDTO() {}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getAnnoFondazione() {
		return annoFondazione;
	}

	public void setAnnoFondazione(String annoFondazione) {
		this.annoFondazione = annoFondazione;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getAteco() {
		return ateco;
	}

	public void setAteco(String ateco) {
		this.ateco = ateco;
	}

	public long getNumDipendenti() {
		return numDipendenti;
	}

	public void setNumDipendenti(long numDipendenti) {
		this.numDipendenti = numDipendenti;
	}

}
