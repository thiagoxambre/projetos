package br.com.helpdesk.model.entity;

public enum TipoUsuario {
	
	CLIENTE("Cliente"),
	TECNICO("T�cnico"),
	ADMINISTRADOR("Administrador");
	
	private String nome;
	
	TipoUsuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	

}
