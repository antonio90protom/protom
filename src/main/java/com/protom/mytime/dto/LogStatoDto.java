package com.protom.mytime.dto;

import java.util.Date;
import com.protom.mytime.entity.Stato;
import com.protom.mytime.entity.Timesheet;

public class LogStatoDto {

	private int id_logstato;
	private String user_utenteins;
	private String user_utentemod;
	private Date data_inizio;
	private Date data_fine;
	private String note;
	private Stato stato;
	private String descrizione_stato;
	private int id_stato;
	private int id_timesheet;
	private Timesheet timesheet;

	public LogStatoDto() {

	}

	public LogStatoDto(int id_logstato, String user_utenteins, String user_utentemod, Date data_inizio, Date data_fine,
			String note
	/* Stato idStato, DettaglioTS idDettaglio */) {
		this.id_logstato = id_logstato;
		this.user_utenteins = user_utenteins;
		this.user_utentemod = user_utentemod;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.note = note;
//		this.idStato = idStato;
//		this.idDettaglio = idDettaglio;
	}

	// costruttore di prova per la visualizzazione della query join senza troppo
	// campi ho inserito 2 campi in più per la join
	public LogStatoDto(int id_logstato, Date data_inizio, Date data_fine, String note, String descrizione_stato,
			int id_stato) {
		this.id_logstato = id_logstato;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.descrizione_stato = descrizione_stato;
		this.note = note;
		this.id_stato = id_stato;

	}

	public LogStatoDto(int id_logstato, int id_timesheet, String user_utenteins, String user_utentemod,
			Date data_inizio, Date data_fine, String note, int id_stato, String descrizione_stato) {
		this.id_logstato = id_logstato;
		this.id_timesheet = id_timesheet;
		this.user_utenteins = user_utenteins;
		this.user_utentemod = user_utentemod;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.note = note;
		this.id_stato = id_stato;
		this.descrizione_stato = descrizione_stato;
	}

	/* Costruttore per la Query FindLogByTimesheet */
	public LogStatoDto(int id_logstato, String user_utenteins, String user_utentemod, Date data_inizio, Date data_fine,
			String descrizione_stato, String note) {
		this.id_logstato = id_logstato;
		this.user_utenteins = user_utenteins;
		this.user_utentemod = user_utentemod;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.descrizione_stato = descrizione_stato;
		this.note = note;

	}

	public LogStatoDto(int id_logstato, String user_utenteins, String user_utentemod, Date data_inizio, Date data_fine,
			String note, Stato stato, int id_timesheet) {
		this.id_logstato = id_logstato;
		this.user_utenteins = user_utenteins;
		this.user_utentemod = user_utentemod;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.note = note;
		this.stato = stato;
		this.id_timesheet = id_timesheet;
	}

	public LogStatoDto(int id_logstato, int id_timesheet, String user_utenteins, String user_utentemod,
			Date data_inizio, Date data_fine, String note, String descrizione_stato, int id_stato) {
		this.id_logstato = id_logstato;
		this.user_utenteins = user_utenteins;
		this.user_utentemod = user_utentemod;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.note = note;
		this.descrizione_stato = descrizione_stato;
		this.id_stato = id_stato;
		this.id_timesheet = id_timesheet;
	}

	public int getId_logstato() {
		return id_logstato;
	}

	public void setId_logstato(int id_logstato) {
		this.id_logstato = id_logstato;
	}

	public String getUser_utenteins() {
		return user_utenteins;
	}

	public void setUser_utenteins(String user_utenteins) {
		this.user_utenteins = user_utenteins;
	}

	public String getUser_utentemod() {
		return user_utentemod;
	}

	public void setUser_utentemod(String user_utentemod) {
		this.user_utentemod = user_utentemod;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public int getId_stato() {
		return id_stato;
	}

	public void setId_stato(int id_stato) {
		this.id_stato = id_stato;
	}

	public String getDescrizione_stato() {
		return descrizione_stato;
	}

	public void setDescrizione_stato(String descrizione_stato) {
		this.descrizione_stato = descrizione_stato;
	}

	public int getId_timesheet() {
		return id_timesheet;
	}

	public void setId_timesheet(int id_timesheet) {
		this.id_timesheet = id_timesheet;
	}

	public Timesheet getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}

}