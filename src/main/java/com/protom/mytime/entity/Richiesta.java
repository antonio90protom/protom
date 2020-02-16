package com.protom.mytime.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "richiesta")
public class Richiesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_richiesta;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipologiarichiesta")
	private TipologiaRichiesta id_tipologiarichiesta;

	/* @OneToOne
	@JoinColumn(name = "id_dettaglio")
	private DettaglioTS dettaglio; */

	@Column(name = "noleggio_auto")
	private Boolean noleggio_auto;

	@Column(name = "richiesta_taxi")
	private Boolean richiesta_taxi;

	@Column(name = "note")
	private String note;

	@OneToMany(mappedBy = "richiesta", fetch = FetchType.EAGER)
	Set<LogstatoRichiesta> logStatiRichiesta;
	
	@OneToOne (mappedBy ="richiesta", fetch = FetchType.EAGER)
	private DettaglioTS dettaglio;
 
	public int getId_richiesta() {
		return id_richiesta;
	}

	public void setId_richiesta(int id_richiesta) {
		this.id_richiesta = id_richiesta;
	}

	public TipologiaRichiesta getId_tipologiarichiesta() {
		return id_tipologiarichiesta;
	}

	public void setId_tipologiarichiesta(TipologiaRichiesta id_tipologiarichiesta) {
		this.id_tipologiarichiesta = id_tipologiarichiesta;
	}

	/* public DettaglioTS getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(DettaglioTS dettaglio) {
		this.dettaglio = dettaglio;
	} */

	public boolean isNoleggio_auto() {
		return noleggio_auto;
	}

	public void setNoleggio_auto(boolean noleggio_auto) {
		this.noleggio_auto = noleggio_auto;
	}

	public boolean isRichiesta_taxi() {
		return richiesta_taxi;
	}

	public void setRichiesta_taxi(boolean richiesta_taxi) {
		this.richiesta_taxi = richiesta_taxi;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
