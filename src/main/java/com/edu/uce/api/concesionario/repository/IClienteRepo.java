package com.edu.uce.api.concesionario.repository;

import java.util.List;

import com.edu.uce.api.concesionario.repository.model.Cliente;
import com.edu.uce.api.concesionario.service.dto.ClienteDTO;




public interface IClienteRepo {
	
	public void  insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);
	
	public List<ClienteDTO> buscarApellido(String apellido);
	public List<Cliente> reporte();
	//extra
	public List<ClienteDTO> buscarTodos();
}
