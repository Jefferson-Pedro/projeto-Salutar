package br.com.isiflix.salutar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isiflix.salutar.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	public Usuario findByLogin(String login);
}
