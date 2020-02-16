package com.protom.mytime.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipologia_richiesta")
public class TipologiaRichiesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipologiarichiesta;

	@Column(name = "descrizione_tipologiarichiesta")
	private String descrizione_tipologiarichiesta;

	@OneToMany(mappedBy = "id_tipologiarichiesta")
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

}
