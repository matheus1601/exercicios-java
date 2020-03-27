package br.com.smu.service;

import java.util.List;

import br.com.smu.entity.Usuario;
import br.com.smu.repository.UsuarioRepository;
import br.com.smu.validation.UsuarioValidation;

public class UsuarioService {

	public UsuarioService(){
		usuarioRepository = new UsuarioRepository();
	}
	
	private UsuarioRepository usuarioRepository;
	
	public Usuario buscarPorId(Integer idUsuario) {
		return usuarioRepository.buscarPorId(idUsuario);
	}
	
	public List<Usuario> listarTodos(){
		return usuarioRepository.listarTodos();
	}
	
	public Usuario salvar(Usuario usuario) {
		if(UsuarioValidation.isValido(usuario)) {
			return usuarioRepository.salvar(usuario);
		}else {
			return null;
		}
	}
	
	public Usuario atualizar(Usuario usuario, Integer idUsuario) {
		if (UsuarioValidation.isValido(usuario)) {
			Usuario existente = usuarioRepository.buscarPorId(idUsuario);
			if(existente != null) {
				usuario.setId(idUsuario);
				return usuarioRepository.atualizar(usuario);
			} else {
				return usuarioRepository.salvar(usuario);
			}						
		} else {
			return null;
		}
	}
	
	public Usuario deletar(Integer idUsuario) {
		return usuarioRepository.deletar(idUsuario);
	}


}
