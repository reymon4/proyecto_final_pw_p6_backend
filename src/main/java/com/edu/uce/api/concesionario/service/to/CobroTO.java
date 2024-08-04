package com.edu.uce.api.concesionario.service.to;

import java.time.LocalDateTime;


public class CobroTO {
	private String numeroTarjeta;
	private Integer reserva;
	private LocalDateTime fecha;
	
	
	
	
	public Integer getReserva() {
		return reserva;
	}
	public void setReserva(Integer reserva) {
		this.reserva = reserva;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
