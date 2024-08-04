package com.edu.uce.api.concesionario.service;

import com.edu.uce.api.concesionario.repository.model.Cobro;
import com.edu.uce.api.concesionario.service.to.CobroTO;

public interface ICobroService {
	public void guardar(CobroTO cobro);
	
	public Cobro buscar(Integer cobro);
}
