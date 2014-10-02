package ageofsteelrpg.personagens;


public abstract class Antagonista extends Personagem {
	
	public String atacar(Personagem atacado) {
		atacado.quantidadeVida -= this.getDano() * 2;
		atacado.reagir(atacado.getResistencia());
		return null;
	}
	

}
