package controle;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.Usuario;

@ManagedBean
@ViewScoped
public class ControladorPrincipal implements Serializable{
	
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private Usuario usuario;
	private String nome;
	private String cidade;
	private int id;
	private boolean update;
	//Utilizado apenas para gerar id ja que não existe bamco
	private int geradorId;
	
	
	public ControladorPrincipal() {
		super();
	}

// Metodo para cadastrar usuario
	public void cadastrarUsuario(){
		//Verifica se é uma atualizacao ou um update
		if(!update){
			usuario  = new Usuario(nome,cidade,geradorId);
			usuarios.add(usuario);
			geradorId++;
			nome = "";
			cidade = "";
		}else{
			Usuario usuarioTemp = null;
			for(Usuario user: usuarios){
				if(user.getId() == id)
					usuarioTemp = user;
			}
			usuarioTemp.setNome(nome);
			usuarioTemp.setCidade(cidade);
			nome = "";
			cidade = "";
			update = false;
		}
	}
// Metodo para deletar usuario
	public void deletarUsuario(Usuario u){
		usuarios.remove(u);
	}
// Metodo para atualizar usuario
	public void atualizarUsuario(Usuario u){
		nome = u.getNome();
		cidade = u.getCidade();
		id = u.getId();
		update = true;
	}


	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
	
}
