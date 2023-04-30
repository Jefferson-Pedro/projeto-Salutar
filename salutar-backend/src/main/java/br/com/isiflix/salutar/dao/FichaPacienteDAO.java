package br.com.isiflix.salutar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isiflix.salutar.model.FichaPaciente;


public interface FichaPacienteDAO extends JpaRepository<FichaPaciente, Integer>{
	
	public List<FichaPaciente> findByNomePacienteContaining(String palavraChave);
}
