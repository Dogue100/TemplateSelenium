package br.execucao.casos.testes;

import org.junit.Test;

import br.main.code.ContentDriver;
import br.utils.code.CodigosAuxiliares;

public class CasoDeTeste01 extends ContentDriver {
	

	@Test
	public void eventoDeTeste01() {
		getDriver().get(getUrl() + "doodles");
		CodigosAuxiliares.tempoSegundos(2);
		
			

	}

}
