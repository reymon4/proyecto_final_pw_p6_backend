package com.edu.uce.api.concesionario.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.uce.api.concesionario.repository.ICobroRepository;
import com.edu.uce.api.concesionario.repository.IReservaRepo;
import com.edu.uce.api.concesionario.repository.model.Cobro;
import com.edu.uce.api.concesionario.service.to.CobroTO;



@Service
public class CobroServiceImpl implements ICobroService {

	@Autowired
	ICobroRepository cobroRepository;
	
	@Autowired
	IReservaRepo iReservaRepo;
	
	@Override
	public void guardar(CobroTO cobro) {
		// TODO Auto-generated method stub
		cobro.setFecha(LocalDateTime.now());
		this.cobroRepository.insertar(this.convetir(cobro));
	}
	
	private Cobro convetir(CobroTO cobro) {
		Cobro result=new Cobro();
		result.setFecha(cobro.getFecha());
		result.setNumeroTarjeta(cobro.getNumeroTarjeta());
		result.setReserva(this.iReservaRepo.buscar(cobro.getReserva()));
		return result;
	}

	@Override
	public Cobro buscar(Integer cobro) {
		// TODO Auto-generated method stub
		return this.cobroRepository.buscar(cobro);
	}

}
