package br.com.smu.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import br.com.smu.entity.Usuario;

public class UsuarioRepository {

	public UsuarioRepository() {
		mockar();
	}
	
	public void mockar() {
		usuariosDB = new TreeMap<>();
		
		Usuario usuarioA = new Usuario();
		usuarioA.setNome("Matheus Ribobiri");
		usuarioA.setEmail("riba@email.com");
		usuarioA.setId(1);

		Usuario usuarioB = new Usuario();
		usuarioB.setNome("Pereba Bolis");
		usuarioB.setEmail("vrau@email.com");
		usuarioB.setId(2);
		
		usuariosDB.put(usuarioA.getId(), usuarioA);
		usuariosDB.put(usuarioB.getId(), usuarioB);
	}
	
	private Map<Integer, Usuario> usuariosDB = null;
	
	public Usuario buscarPorId(Integer idUsuario) {
		return usuariosDB.get(idUsuario);
	}
	
	public List<Usuario> listarTodos(){
		List<Usuario> usuarios = new ArrayList<>();
		usuariosDB.forEach((k,v)-> {
			usuarios.add(v);
		});
		return usuarios;
	}
	
	public Usuario salvar (Usuario usuario) {
		usuariosDB.put(usuario.getId(), usuario);
		return usuario;
	}
	
	public Usuario atualizar (Usuario usuario) {
		usuariosDB.put(usuario.getId(), usuario);
		return usuario;
	}
	
	public Usuario deletar (Integer idUsuario) {
		return usuariosDB.remove(idUsuario);
	}
}
