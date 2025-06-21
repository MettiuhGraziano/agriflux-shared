package com.agriflux.agrifluxshared.dto.particella;

import java.time.LocalDate;

public class DatiParticellaDateDTO {
	
	private LocalDate dataUltimoRaccolto;
	private String annoInstallazione;
	
	public DatiParticellaDateDTO() {}
	
	public DatiParticellaDateDTO(LocalDate dataUltimoRaccolto, String annoInstallazione) {
		this.dataUltimoRaccolto = dataUltimoRaccolto;
		this.annoInstallazione = annoInstallazione;
	}

	public LocalDate getDataUltimoRaccolto() {
		return dataUltimoRaccolto;
	}

	public void setDataUltimoRaccolto(LocalDate dataUltimoRaccolto) {
		this.dataUltimoRaccolto = dataUltimoRaccolto;
	}

	public String getAnnoInstallazione() {
		return annoInstallazione;
	}

	public void setAnnoInstallazione(String annoInstallazione) {
		this.annoInstallazione = annoInstallazione;
	}
	
}
