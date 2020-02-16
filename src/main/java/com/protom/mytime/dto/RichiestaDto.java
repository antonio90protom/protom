package com.protom.mytime.dto;

import java.util.Date;
import java.util.Set;
import com.protom.mytime.entity.LogstatoRichiesta;
import com.protom.mytime.entity.TipologiaRichiesta;

public class RichiestaDto {

	private int id_richiesta;
	private int id_tipologiarichiesta;
	/* private int id_dettaglio; */
	private Boolean noleggio_auto;
	private Boolean richiesta_taxi;
	private String note;
/*	private DettaglioTS dettaglio; */
	private TipologiaRichiesta TipologiaRichiesta;
	private Set<LogstatoRichiesta> logStatiRichieste;
	private Date data_inizio;
	private Date data_fine;
	private String descrizione_tipologiarichiesta;

	public RichiestaDto() {
	}

	public String getDescrizione_tipologiarichiesta() {
		return descrizione_tipologiarichiesta;
	}

	public void setDescrizione_tipologiarichiesta(String descrizione_tipologiarichiesta) {
		this.descrizione_tipologiarichiesta = descrizione_tipologiarichiesta;
	}

	public RichiestaDto(int id_richiesta, Boolean noleggio_auto, Boolean richiesta_taxi, String note,
			String descrizione_tipologiarichiesta) {
		this.id_richiesta = id_richiesta;
		this.noleggio_auto = noleggio_auto;
		this.richiesta_taxi = richiesta_taxi;
		this.note = note;
		this.descrizione_tipologiarichiesta = descrizione_tipologiarichiesta;
	}

	public RichiestaDto(int id_richiesta, Boolean noleggio_auto, Boolean richiesta_taxi, String note, Date data_inizio,
			Date data_fine) {
		this.id_richiesta = id_richiesta;
		this.noleggio_auto = noleggio_auto;
		this.richiesta_taxi = richiesta_taxi;
		this.note = note;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
	}

	public RichiestaDto(int id_richiesta, String descrizione_tipologiarichiesta, Boolean noleggio_auto, Boolean richiesta_taxi, String note
			) {
		this.id_richiesta = id_richiesta;
		this.noleggio_auto = noleggio_auto;
		this.richiesta_taxi = richiesta_taxi;
		this.note = note;
		this.descrizione_tipologiarichiesta = descrizione_tipologiarichiesta;
	}
	

	public Date getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}

	public Date getData_fine() {
		return data_fine;
	}

	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}

	public RichiestaDto(int id_richiesta, int id_tipologiarichiesta, Boolean noleggio_auto,
			Boolean richiesta_taxi, String note) {
		this.id_richiesta = id_richiesta;
		this.id_tipologiarichiesta = id_tipologiarichiesta;
		this.noleggio_auto = noleggio_auto;
		this.richiesta_taxi = richiesta_taxi;
		this.note = note;
	}

	public int getId_tipologiarichiesta() {
		return id_tipologiarichiesta;
	}

	public void setId_tipologiarichiesta(int id_tipologiarichiesta) {
		this.id_tipologiarichiesta = id_tipologiarichiesta;
	}

	public int getId_richiesta() {
		return id_richiesta;
	}

	public void setId_richiesta(int id_richiesta) {
		this.id_richiesta = id_richiesta;
	}

	public Boolean isNoleggio_auto() {
		return noleggio_auto;
	}

	public void setNoleggio_auto(Boolean noleggio_auto) {
		this.noleggio_auto = noleggio_auto;
	}

	public Boolean isRichiesta_taxi() {
		return richiesta_taxi;
	}

	public void setRichiesta_taxi(Boolean richiesta_taxi) {
		this.richiesta_taxi = richiesta_taxi;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/* public DettaglioTS getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(DettaglioTS dettaglio) {
		this.dettaglio = dettaglio;
	} */

	public TipologiaRichiesta getTipologiaRichiesta() {
		return TipologiaRichiesta;
	}

	public void setTipologiaRichiesta(TipologiaRichiesta tipologiaRichiesta) {
		TipologiaRichiesta = tipologiaRichiesta;
	}

	public Set<LogstatoRichiesta> getLogStatiRichieste() {
		return logStatiRichieste;
	}

	public void setLogStatiRichieste(Set<LogstatoRichiesta> logStatiRichieste) {
		this.logStatiRichieste = logStatiRichieste;
	}

}
