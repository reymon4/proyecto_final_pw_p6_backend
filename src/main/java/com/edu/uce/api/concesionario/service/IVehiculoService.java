package com.edu.uce.api.concesionario.service;

import java.util.List;

import com.edu.uce.api.concesionario.service.dto.VehiculoDTO;
import com.edu.uce.api.concesionario.service.to.VehiculoTO;




public interface IVehiculoService {
	
	public void ingresar(VehiculoTO vehiculo);
	public void actualizar(VehiculoTO vehiculo);
	public VehiculoTO buscar(String placa);
	public void eliminar(String placa);
	
	public List<VehiculoDTO> buscarVehiculosDisponiblres(String marca, String modelo);
	public List<VehiculoDTO> buscarPorMarca(String marca);
	//EXTRA
	public List<String> buscarMarcasVehiculos();
	public List<VehiculoDTO> obtenerTodos();
	public List<String> obtenerModelosPorMarca(String marca);

}
