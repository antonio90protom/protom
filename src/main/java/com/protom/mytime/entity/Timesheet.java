package com.protom.mytime.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Timesheet")
public class Timesheet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_timesheet;

	@Column(name = "username")
	private String username;

	@Column(name = "username_approvatore")
	private String username_approvatore;

	@Column(name = "periodo")
	private String periodo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername_approvatore() {
		return username_approvatore;
	}

	public void setUsername_approvatore(String username_approvatore) {
		this.username_approvatore = username_approvatore;
	}

	@OneToMany(mappedBy = "timesheet", fetch = FetchType.EAGER)
	private Set<DettaglioTS> dettagli;
	
	@OneToMany (mappedBy="timesheet", fetch = FetchType.EAGER)
	private Set<LogStato> stati;

	public int getid_timesheet() {
		return id_timesheet;
	}

	public void set_idtimesheet(int id_timesheet) {
		this.id_timesheet = id_timesheet;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Set<DettaglioTS> getDettagli() {
		return dettagli;
	}

	public void setDettagli(Set<DettaglioTS> dettagli) {
		this.dettagli = dettagli;
	}

}
