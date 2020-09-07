package com.evento.eventoapp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.evento.eventoapp.endpoint.IZidane;

@Service
@Qualifier("barcelona")
public class BarcelonaService implements IZidane{

	@Override
	public void contrato() {
		System.out.println("Contrato - Barcelona");
		
	}

	@Override
	public void objetivos() {
		System.out.println("Objetivos - Vencer o campeonato Espanho");
		
	}

	@Override
	public void fimDoContrato() {
		System.out.println("Fim do Contrato - 2022");
		
	}


}
