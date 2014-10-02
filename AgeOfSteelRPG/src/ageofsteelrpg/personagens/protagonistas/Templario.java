package ageofsteelrpg.personagens.protagonistas;

import ageofsteelrpg.personagens.Protagonista;

public class Templario extends Protagonista {

	static final int DANO = 40;
	static final int RESISTENCIA = 40;
	static final int PODERINCREMENTO = 100;
	@Override
	public int getDano() {
		return this.DANO;
	}
	@Override
	public int getResistencia() {
		return this.RESISTENCIA;
	}
	@Override
	public int getPoderIncremento() {
		return this.PODERINCREMENTO;
	}

}
