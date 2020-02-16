package com.protom.mytime.dto;

import java.util.Date;

import com.protom.mytime.entity.Richiesta;
import com.protom.mytime.entity.Stato;

public class LogstatoRichiestaDto {

	private int id_logstatorichiesta;
	private Stato stato;
	private Richiesta richiesta;
	private Date data_inizioapprovazione;
	private Date data_fineapprovazione;
	private String user_richiedente;
	private String user_approvatore;

	public int getId_logstatorichiesta() {
		return id_logstatorichiesta;
	}

	public void setId_logstatorichiesta(int id_logstatorichiesta) {
		this.id_logstatorichiesta = id_logstatorichiesta;
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

	public LogstatoRichiestaDto(int id_logstatorichiesta, Date data_inizioapprovazione, Date data_fineapprovazione,
			String user_richiedente, String user_approvatore) {
		this.id_logstatorichiesta = id_logstatorichiesta;
		this.data_inizioapprovazione = data_inizioapprovazione;
		this.data_fineapprovazione = data_fineapprovazione;
		this.user_richiedente = user_richiedente;
		this.user_approvatore = user_approvatore;
	}

}
