package com.ordinatore;

import java.util.Collections;
import java.util.List;

public class OrdinatoreImpl implements Ordinatore {

	@Override
	public List<Processo> ordinaPerId(List<Processo> processiNonOrdinati) {
		Collections.sort(processiNonOrdinati, new IdProcessoComparator());
		return processiNonOrdinati;
	}

	@Override
	public List<Processo> ordinaPerPriorita(List<Processo> processiNonOrdinati) {
		Collections.sort(processiNonOrdinati, new PrioritaProcessoComparator());
		return processiNonOrdinati;
	}

}
