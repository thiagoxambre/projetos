package ageofsteelrpg.personagens.protagonistas;

import ageofsteelrpg.personagens.Protagonista;

public class Cavaleiro extends Protagonista {

	static final int DANO = 15;
	static final int RESISTENCIA = 50;
	static final int PODERINCREMENTO = 60;
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
