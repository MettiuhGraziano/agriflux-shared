package com.agriflux.agrifluxshared.dto.particella;

import java.time.LocalDateTime;

public class DatiParticellaDateDTO {
	
	private LocalDateTime dataUltimoRaccolto;
	private String annoInstallazione;
	
	public DatiParticellaDateDTO() {}
	
	public DatiParticellaDateDTO(LocalDateTime dataUltimoRaccolto, String annoInstallazione) {
		this.dataUltimoRaccolto = dataUltimoRaccolto;
		this.annoInstallazione = annoInstallazione;
	}

	public LocalDateTime getDataUltimoRaccolto() {
		return dataUltimoRaccolto;
	}

	public void setDataUltimoRaccolto(LocalDateTime dataUltimoRaccolto) {
		this.dataUltimoRaccolto = dataUltimoRaccolto;
	}

	public String getAnnoInstallazione() {
		return annoInstallazione;
	}

	public void setAnnoInstallazione(String annoInstallazione) {
		this.annoInstallazione = annoInstallazione;
	}
	
}
