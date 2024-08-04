package com.edu.uce.api.concesionario.repository;

import java.util.List;

import com.edu.uce.api.concesionario.repository.model.Vehiculo;
import com.edu.uce.api.concesionario.service.dto.VehiculoDTO;



public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void eliminar(String placa);
	
	public List<VehiculoDTO> buscarMarca(String marca);
	public List<VehiculoDTO> buscarMarcaModelo(String marca, String modelo);
	// EXTRA
	public List<String> buscarMarcasVehiculos();
	public List<VehiculoDTO> buscarTodos();
	public List<String> buscarModelosPorMarca(String marca);
}
