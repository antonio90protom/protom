package com.protom.mytime.dto;

import java.time.LocalTime;
import java.util.Date;

import com.protom.mytime.entity.Richiesta;
import com.protom.mytime.entity.Timesheet;

public class DettaglioTSDto {

	private int id_dettaglio;
	private int codiceCommessa;
	private int task;
	private Date data_inizio;
	private Date data_fine;
	private LocalTime ora_inizio;
	private LocalTime ora_fine;
	private String sede;
	private String note;
	private Timesheet timesheet;
	private Richiesta richiesta;

	public DettaglioTSDto() {
	}

	public DettaglioTSDto(int id_dettaglio, int codiceCommessa, int task, Date data_inizio, Date data_fine,
			LocalTime ora_inizio, LocalTime ora_fine, String sede, String note) {
		this.id_dettaglio = id_dettaglio;
		this.codiceCommessa = codiceCommessa;
		this.task = task;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.ora_inizio = ora_inizio;
		this.ora_fine = ora_fine;
		this.sede = sede;
		this.note = note;
	}

	/*
	 * Costruttore per servizio che immagazzina i dati dal DTO del front al database
	 */
	public DettaglioTSDto(Timesheet timesheet, int id_dettaglio, int codiceCommessa, int task, Richiesta richiesta, Date data_inizio, Date data_fine,
			LocalTime ora_inizio, LocalTime ora_fine, String sede, String note) {
		this.id_dettaglio = id_dettaglio;
		this.codiceCommessa = codiceCommessa;
		this.task = task;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.ora_inizio = ora_inizio;
		this.ora_fine = ora_fine;
		this.sede = sede;
		this.note = note;
		this.timesheet = timesheet;
		this.richiesta = richiesta;
	}

	public int getId_dettaglio() {
		return id_dettaglio;
	}

	public void setId_dettaglio(int id_dettaglio) {
		this.id_dettaglio = id_dettaglio;
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

	public LocalTime getOra_inizio() {
		return ora_inizio;
	}

	public void setOra_inizio(LocalTime ora_inizio) {
		this.ora_inizio = ora_inizio;
	}

	public LocalTime getOra_fine() {
		return ora_fine;
	}

	public void setOra_fine(LocalTime ora_fine) {
		this.ora_fine = ora_fine;
	}

	public int getCodiceCommessa() {
		return codiceCommessa;
	}

	public void setCodiceCommessa(int codiceCommessa) {
		this.codiceCommessa = codiceCommessa;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Timesheet getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}

	public int getTask() {
		return task;
	}

	public void setTask(int task) {
		this.task = task;
	}

	public Richiesta getRichiesta() {
		return richiesta;
	}

	public void setRichiesta(Richiesta richiesta) {
		this.richiesta = richiesta;
	}


}
