package com.evento.eventoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.evento.eventoapp.endpoint.IEmpresario;
import com.evento.eventoapp.endpoint.IZidane;

@Component
public class ZidaneController {

	@Autowired
	@Qualifier("barcelona")
	IZidane time;
	
	@Autowired
	@Qualifier("empresarioRepo")
	IEmpresario ceo;
	
//	public ZidaneController(IZidane time, IEmpresario ceo) {
//		this.time = time;
//		this.ceo = ceo;
//	} OBS: O uso desse construtor foi depreciado com o uso da injeção de depndência @Autowired
	
	public void buscarTime() {
		time.contrato();
		time.objetivos();
		time.fimDoContrato();
	}
	
	public void empresarioDeZidane() {
		ceo.empresario();
	}

}
