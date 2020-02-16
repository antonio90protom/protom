package com.protom.mytime.dto;

import java.util.Set;

import com.protom.mytime.entity.LogStato;

public class StatoDto {
	private int id_stato;
	private String DescrizioneStato;
	private String ordinamento;
	private Set<LogStato> logStati;
	
public StatoDto() {}
	
public StatoDto(int id_stato, String DescrizioneStato, String ordinamento) 
		{
		this.id_stato = id_stato;
		this.DescrizioneStato = DescrizioneStato;
		this.ordinamento = ordinamento;	
		}
	

	public int getIdStato() {
	return id_stato;
}

public void setIdStato(int id_stato) {
	this.id_stato = id_stato;
}

	public String getDescrizioneStato() {
		return DescrizioneStato;
	}
	public void setDescrizioneStato(String DescrizioneStato) {
		this.DescrizioneStato = DescrizioneStato;
	}
	public String getOrdinamento() {
		return ordinamento;
	}
	public void setOrdinamento(String ordinamento) {
		this.ordinamento = ordinamento;
	}
	public Set<LogStato> getLogStati() {
		return logStati;
	}
	public void setLogStati(Set<LogStato> logStati) {
		this.logStati = logStati;
	}
	

	
	
	
	

}
