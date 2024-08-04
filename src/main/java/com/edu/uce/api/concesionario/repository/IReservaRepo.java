package com.edu.uce.api.concesionario.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.edu.uce.api.concesionario.repository.model.Reserva;



public interface IReservaRepo {
	
	public void insertar(Reserva reserva);
	public void actualizar(Reserva reserva);
	public Reserva buscar(Integer numero);
	public void eliminar(Integer numero);
	public Reserva buscarPorClienteFecha(String cedula, String placa, LocalDateTime fechaInicio);
	public List<Reserva> buscarReporte(LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
