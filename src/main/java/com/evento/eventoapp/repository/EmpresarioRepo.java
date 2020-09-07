package com.evento.eventoapp.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.evento.eventoapp.endpoint.IEmpresario;

@Repository
@Qualifier("empresarioRepo")
public class EmpresarioRepo implements IEmpresario{

	@Override
	public void empresario() {
		System.out.println("Empresário - Luiz Fernando");
		
	}

}
