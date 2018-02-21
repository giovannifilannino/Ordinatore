package com.ordinatore;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Processo> processi = new ArrayList<Processo>();
		
		Processo p1 = new Processo();
		p1.setIdProcesso(3);
		p1.setPriorita(1);
		Processo p2 = new Processo();
		p2.setIdProcesso(2);
		p2.setPriorita(2);
		Processo p3 = new Processo();
		p3.setIdProcesso(1);
		p3.setPriorita(3);
		processi.add(p1);
		processi.add(p2);
		processi.add(p3);
		
		System.out.println("Id prima del sort:");
		
		for (Processo p : processi)
			System.out.println(p.getIdProcesso());
		
		Ordinatore ord = new OrdinatoreImpl();
		
		ord.ordinaPerId(processi);
		
		System.out.println("Id dopo il sort:");
		
		for (Processo p : processi)
			System.out.println(p.getIdProcesso());
		
		System.out.println("Priorità prima del sort:");
		
		for (Processo p : processi)
			System.out.println(p.getPriorita());
		
		ord.ordinaPerPriorita(processi);
		
		System.out.println("Priorità dopo il sort:");
		
		for (Processo p : processi)
			System.out.println(p.getPriorita());
	}

}
