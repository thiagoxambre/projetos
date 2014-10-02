package ageofsteelrpg.personagens.antagonistas;

import ageofsteelrpg.personagens.Antagonista;

public class Gladiador extends Antagonista {

	static final int DANO = 30;
	static final int RESISTENCIA = 30;
	@Override
	public int getDano() {
		return this.DANO;
	}
	@Override
	public int getResistencia() {
		return this.RESISTENCIA;
	}

}
