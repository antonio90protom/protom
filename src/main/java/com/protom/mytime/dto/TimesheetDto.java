package com.protom.mytime.dto;

public class TimesheetDto {
	private int id_timesheet;
	private String username;
	private String user_approvatore;
	private String periodo;
	private Integer codiceCommessa;
	/*private DettaglioTS idDettaglio */
	private int id_stato;
	
	public TimesheetDto() {
		
	}
	
	public TimesheetDto(int id_timesheet, String username) {
		this.id_timesheet = id_timesheet;
		this.username = username;
	}
	
	public TimesheetDto(int id_timesheet, String username, String user_approvatore, String periodo) {
		this.id_timesheet = id_timesheet;
		this.username = username;
		this.user_approvatore = user_approvatore;
		this.periodo=periodo;
	}
	
//	public TimesheetDto(int id_timesheet, String username, String user_approvatore, Integer codiceCommessa, String periodo) {
//	
//		this.id_timesheet = id_timesheet;
//		this.username= username;
//		this.user_approvatore = user_approvatore;
//		this.periodo=periodo;
//		this.codiceCommessa = codiceCommessa;
//	}

	
	public TimesheetDto(int id_timesheet, String username, String user_approvatore, Integer codiceCommessa, String periodo, int id_stato) {
		
		this.id_timesheet = id_timesheet;
		this.username= username;
		this.user_approvatore = user_approvatore;
		this.periodo=periodo;
		this.codiceCommessa = codiceCommessa;
		this.id_stato=id_stato;
	}


	public int getId_timesheet() {
		return id_timesheet;
	}


	public void setId_timesheet(int id_timesheet) {
		this.id_timesheet = id_timesheet;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUser_approvatore() {
		return user_approvatore;
	}


	public void setUser_approvatore(String user_approvatore) {
		this.user_approvatore = user_approvatore;
	}


	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getCodiceCommessa() {
		return codiceCommessa;
	}

	public void setCodiceCommessa(Integer codiceCommessa) {
		this.codiceCommessa = codiceCommessa;
	}

	public int getId_stato() {
		return id_stato;
	}

	public void setId_stato(int id_stato) {
		this.id_stato = id_stato;
	}
	
	
}
