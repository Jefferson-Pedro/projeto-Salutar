package br.com.isiflix.salutar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.isiflix.salutar.model.FichaPaciente;
import br.com.isiflix.salutar.service.ficha.IFichaService;

@SpringBootTest
@ActiveProfiles("test")
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
	/*
	@Test
	public void shouldDeleteFicha() {
		assertTrue(service.excluir(2));
	}
	
	@Test
	public void shouldNotDeleteFicha() {
		assertFalse(service.excluir(9999999));
	}*/
}
