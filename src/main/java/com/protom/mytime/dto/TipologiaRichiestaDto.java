package com.protom.mytime.dto;

import java.util.Set;

import com.protom.mytime.entity.Richiesta;

public class TipologiaRichiestaDto {

	private int id_tipologiarichiesta;
	private String descrizione_tipologiarichiesta;
	private Set<Richiesta> richieste;

	public int getId_tipologiarichiesta() {
		return id_tipologiarichiesta;
	}

	public void setId_tipologiarichiesta(int id_tipologiarichiesta) {
		this.id_tipologiarichiesta = id_tipologiarichiesta;
	}

	public String getDescrizione_tipologiarichiesta() {
		return descrizione_tipologiarichiesta;
	}

	public void setDescrizione_tipologiarichiesta(String descrizione_tipologiarichiesta) {
		this.descrizione_tipologiarichiesta = descrizione_tipologiarichiesta;
	}

	public Set<Richiesta> getRichieste() {
		return richieste;
	}

	public void setRichieste(Set<Richiesta> richieste) {
		this.richieste = richieste;
	}

	public TipologiaRichiestaDto(int id_tipologiarichiesta, String descrizione_tipologiarichiesta) {
		this.id_tipologiarichiesta = id_tipologiarichiesta;
		this.descrizione_tipologiarichiesta = descrizione_tipologiarichiesta;
	}

	public TipologiaRichiestaDto () {};
}
