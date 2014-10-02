package ageofsteelrpg.personagens;

import java.util.Random;

public abstract class Personagem {
	
	protected String nome;
	protected int quantidadeVida;
	
	public abstract int getDano();

	public abstract int getResistencia();
	
	public abstract String atacar(Personagem atacado);
	
	public void reagir(int reducao) {
		Random gerador = new Random();
		Boolean seDefender = gerador.nextBoolean();
		if (seDefender) {
			this.quantidadeVida += reducao;
		}
	}

}
