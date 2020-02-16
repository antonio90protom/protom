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

@Entity
@Table(name = "Logstato_richiesta")
public class LogstatoRichiesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_logstato_richiesta;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_stato")
	private Stato stato;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_richiesta")
	private Richiesta richiesta;

	@Column(name = "data_inizioapprovazione")
	private Date data_inizioapprovazione;

	@Column(name = "data_fineapprovazione")
	private Date data_fineapprovazione;

	@Column(name = "user_richiedente")
	private String user_richiedente;

	@Column(name = "user_approvatore")
	private String user_approvatore;

	public Integer getId_logstato_richiesta() {
		return id_logstato_richiesta;
	}

	public void setId_logstato_richiesta(Integer id_logstato_richiesta) {
		this.id_logstato_richiesta = id_logstato_richiesta;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Richiesta getRichiesta() {
		return richiesta;
	}

	public void setRichiesta(Richiesta richiesta) {
		this.richiesta = richiesta;
	}

	public Date getData_inizioapprovazione() {
		return data_inizioapprovazione;
	}

	public void setData_inizioapprovazione(Date data_inizioapprovazione) {
		this.data_inizioapprovazione = data_inizioapprovazione;
	}

	public Date getData_fineapprovazione() {
		return data_fineapprovazione;
	}

	public void setData_fineapprovazione(Date data_fineapprovazione) {
		this.data_fineapprovazione = data_fineapprovazione;
	}

	public String getUser_richiedente() {
		return user_richiedente;
	}

	public void setUser_richiedente(String user_richiedente) {
		this.user_richiedente = user_richiedente;
	}

	public String getUser_approvatore() {
		return user_approvatore;
	}

	public void setUser_approvatore(String user_approvatore) {
		this.user_approvatore = user_approvatore;
	}

}
