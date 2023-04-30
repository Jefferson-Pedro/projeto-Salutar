package br.com.isiflix.salutar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isiflix.salutar.model.FichaPaciente;
import br.com.isiflix.salutar.service.ficha.IFichaService;

@SpringBootTest
public class FichaTest {
	
	@Autowired
	IFichaService service;
	
	@Test
	public void shouldCreateFicha() {
		FichaPaciente f = new FichaPaciente();
		f.setIdFicha(1);
		f.setNomePaciente("Jefferson");
		FichaPaciente res = service.cadastrar(f);
		assertTrue(res != null && res.getUuId() != null && res.getAtivo() == 1);
	}
}
