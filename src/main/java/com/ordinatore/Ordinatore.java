package com.ordinatore;

import java.util.List;

public interface Ordinatore {

	List<Processo> ordinaPerId(List<Processo> processiNonOrdinati);
	
	List<Processo> ordinaPerPriorita(List<Processo> processiNonOrdinati);
	
}
