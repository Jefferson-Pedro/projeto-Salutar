package br.com.isiflix.salutar.service.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.isiflix.salutar.dao.UsuarioDAO;
import br.com.isiflix.salutar.model.Usuario;
import br.com.isiflix.salutar.security.SalutarToken;
import br.com.isiflix.salutar.security.TokenUtil;

@Component
public class AuthServiceImpl implements IAuthService{
	
	@Autowired
	UsuarioDAO dao;

	@Override
	public Usuario criarUsuario(Usuario novo) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String novaSenha = encoder.encode(novo.getSenha());
		novo.setSenha(novaSenha);
		return dao.save(novo);
	}

	@Override
	public SalutarToken realizarLogin(Usuario dadosLogin) {
		Usuario res = dao.findByLogin(dadosLogin.getlogin());
		System.out.println("DADOS LOGIN" + res.toString());
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(res != null) {
			if(encoder.matches(dadosLogin.getSenha(), res.getSenha())){
				return TokenUtil.encode(res);
			}
		}
		return null;
	}

}
