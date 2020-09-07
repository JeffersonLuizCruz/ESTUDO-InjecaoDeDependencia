package com.evento.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.evento.eventoapp.controller.ZidaneController;




//import com.evento.eventoapp.controller.ZidaneController;
//import com.evento.eventoapp.endpoint.IEmpresario;
//import com.evento.eventoapp.endpoint.IZidane;
//import com.evento.eventoapp.repository.EmpresarioRepo;
//import com.evento.eventoapp.service.BarcelonaService;
//import com.evento.eventoapp.service.RealMadridService;

//import com.evento.eventoapp.service.BarcelonaService;
//import com.evento.eventoapp.service.RealMadridService;

@SpringBootApplication
public class EventoApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(EventoApplication.class, args);
		ZidaneController zidane = applicationContext.getBean(ZidaneController.class);
		
		System.out.println("====================================================");
		
		zidane.buscarTime();
		zidane.empresarioDeZidane();
		
//		ZidaneController zidane = new ZidaneController(new BarcelonaService(), new EmpresarioRepo());
		

		
//		RealMadridService real = new RealMadridService();
//		System.out.println("====================================================");
//		real.contrato();
//		real.objetivos();
//		real.fimDoContrato();
		
//		System.out.println("====================================================");
//		/////Barcelona///
//		
//		BarcelonaService barca = new BarcelonaService();
//		barca.contrato();
//		barca.objetivos();
//		barca.fimDoContrato();
	}

}
