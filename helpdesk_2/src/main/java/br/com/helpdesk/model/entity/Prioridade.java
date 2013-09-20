package br.com.helpdesk.model.entity;

public enum Prioridade {
	MUITOBAIXO("Muito Baixo"),
	BAIXO("Baixo"),
	NORMAL("Normal"),
	ALTO("Alto"),
	MUITOALTO("Muito Alto");
	
	private String nome;
	
	Prioridade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return this.nome;
	}

}
