package com.edu.uce.api.concesionario.repository;

import com.edu.uce.api.concesionario.repository.model.Cobro;

public interface ICobroRepository {
	public void insertar(Cobro cobro);
	
	public Cobro buscar(Integer cobro);
}
