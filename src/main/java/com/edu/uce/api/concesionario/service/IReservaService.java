package com.edu.uce.api.concesionario.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.edu.uce.api.concesionario.service.dto.ReservaDTO;
import com.edu.uce.api.concesionario.service.to.ReporteTO;
import com.edu.uce.api.concesionario.service.to.ReservaTO;
import com.edu.uce.api.concesionario.service.to.RetiroTO;



public interface IReservaService {
	

	public BigDecimal consultarValorReserva(String placa, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	public LocalDateTime consultarReserva(String placa, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	public void reservar(ReservaDTO reserva);
	public String retirarVehiculoReservado(Integer numero);
	public List<ReporteTO> reporte(LocalDateTime fechaInicio, LocalDateTime fechaFin);
	public ReservaTO buscarPorClienteFecha(String cedula, String placa, LocalDateTime fechaInicio);
	public RetiroTO obtener(Integer numero);

	public List<ReservaTO> buscarReservasSuperpuestas(LocalDateTime fechaInicio, LocalDateTime fechaFin, String placa);
}
