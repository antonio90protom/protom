package com.protom.mytime.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="Logstato")
public class LogStato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_logstato;
	
	@Column (name="user_utenteins")
	private String user_utenteins; 
	
	@Column (name="user_utentemod")
	private String user_utentemod;
	
	@Temporal(TemporalType.DATE)
	@Column (name="data_inizio")
	private Date data_inizio;
	
	@Temporal(TemporalType.DATE)
	@Column (name="data_fine")
	private Date data_fine;

	@Column (name="note")
	private String note;
	//I JoinColumn fanno riferimento alla colonna della tabella a cui ci si riferisce, precisamente
	//Fanno riferimento alla colonna chiave primaria della tabella (Primary Key che diventa Foreign Key della tabella lato N
	//E poi si crea un oggetto della classe uguale alla tabella lato 1
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_stato" )
	private Stato id_stato;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_timesheet")
	private Timesheet timesheet;
	
	

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

	public Stato getId_stato() {
		return id_stato;
	}

	public void setId_stato(Stato id_stato) {
		this.id_stato = id_stato;
	}


	public Timesheet getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}

	public Date getDataInizio() {
		return data_inizio;
	}

	public void setDataInizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}

	public Date getDataFine() {
		return data_fine;
	}

	public void setDataFine(Date data_fine) {
		this.data_fine = data_fine;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	

}
