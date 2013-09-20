package br.com.helpdesk.model.entity;

public enum EstadoChamado {
	ABERTO("Aberto"),
	AGUARDANDO("Aguardando Terceiros"),
	FINALIZADO("Finalizado com exito"),
	FINALIZADOSEMEXITO("Finalizado sem exito");
	
	private String nome;
	
	EstadoChamado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return this.nome;
	}

}
