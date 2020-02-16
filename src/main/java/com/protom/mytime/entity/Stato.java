package com.protom.mytime.entity;

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
@Table(name = "stato")
public class Stato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_stato;

	@Column(name = "descrizione_stato")
	private String descrizione_stato;

	@Column(name = "ordinamento")
	private String ordinamento;

	// OneToMany per la relazione 1 a N tra Stato e LogStato.
	// In MappedBy ci va il nome del campo della tabella a cui ci si riferisce e che
	// consente la join
	/*
	 * ESEMPIO: Il set di LogStato punta all'idStato quindi la mappatura deve
	 * avvenire tramite idStato ovvero l'attributo creato nell'altra tabella
	 */
	// E si deve creare un set con un generic di tipo uguale al nome della classe
	// lato N (LogStato)
	@OneToMany(mappedBy = "id_stato", fetch = FetchType.EAGER)
	private Set<LogStato> logStati;

	@OneToMany(mappedBy = "stato", fetch = FetchType.EAGER)
	private Set<LogstatoRichiesta> logStatiRichiesta;

	public Integer getId_stato() {
		return id_stato;
	}

	public void setId_stato(Integer id_stato) {
		this.id_stato = id_stato;
	}

	public String getDescrizione_stato() {
		return descrizione_stato;
	}

	public void setDescrizione_stato(String descrizione_stato) {
		this.descrizione_stato = descrizione_stato;
	}

	public String getOrdinamento() {
		return ordinamento;
	}

	public void setOrdinamento(String ordinamento) {
		this.ordinamento = ordinamento;

	}

}
