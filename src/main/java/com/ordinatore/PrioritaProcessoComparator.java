package com.ordinatore;

import java.util.Comparator;

public class PrioritaProcessoComparator implements Comparator <Processo>{

	@Override
	public int compare(Processo arg0, Processo arg1) {
		//se il primo è minore del secondo = -1
		//se sono uguali = 0
		//se è maggiore = 1		
		return
			((Processo) arg0).getPriorita() < ((Processo) arg1).getPriorita()
			?
			-1
			:
			((Processo) arg0).getPriorita() == ((Processo) arg1).getPriorita()
			?
			0
			:
			1;
	}

}
