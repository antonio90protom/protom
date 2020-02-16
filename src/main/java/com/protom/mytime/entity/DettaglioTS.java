package com.protom.mytime.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DettaglioTS")
public class DettaglioTS implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dettaglio;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_timesheet")
	private Timesheet timesheet;

	@Column(name = "id_commessa")
	private int codiceCommessa;
	
	@Column (name="task")
	private int task;

//		@Temporal(TemporalType.DATE)
	@Column(name = "data_inizio")
	private Date data_inizio;
//		
//		@Temporal(TemporalType.DATE)
	@Column(name = "data_fine")
	private Date data_fine;
	
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_richiesta")
	private Richiesta richiesta;

//		@Temporal(TemporalType.TIME)
	@Column(name = "ora_inizio")
	private LocalTime ora_inizio;
//		
//		@Temporal(TemporalType.TIME)
	@Column(name = "ora_fine")
	private LocalTime ora_fine;

	@Column(name = "sede")
	private String sede;

	@Column(name = "note")
	private String note;

/*	@OneToOne(mappedBy = "dettaglio")
	private Richiesta richiesta;
*/
	public int getId_dettaglio() {
		return id_dettaglio;
	}

	public void setId_dettaglio(int id_dettaglio) {
		this.id_dettaglio = id_dettaglio;
	}

	public int getCodiceCommessa() {
		return codiceCommessa;
	}

	public void setCodiceCommessa(int codiceCommessa) {
		this.codiceCommessa = codiceCommessa;
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
