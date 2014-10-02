package ageofsteelrpg.personagens.antagonistas;

import ageofsteelrpg.personagens.Antagonista;

public class Atirador extends Antagonista {
	
	static final int DANO = 15;
	static final int RESISTENCIA = 50;
	@Override
	public int getDano() {
		return this.DANO;
	}
	@Override
	public int getResistencia() {
		return this.RESISTENCIA;
	}
	
	
}
