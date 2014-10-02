package ageofsteelrpg.personagens;


public abstract class Protagonista extends Personagem {
	
	protected int fatorincremento;
	
	
	@Override
	public String atacar(Personagem atacado) {
		atacado.quantidadeVida -= this.getDano();
		atacado.reagir(atacado.getResistencia());
		return null;
	}
	
	// poderIncremento 0 - 100
	// máximo de fator de incremento é de 20% para protagonistas com vida de 100% e porder de incremento de 100%
	public int calcularFatorIncremento() {
		return (this.quantidadeVida * (this.getPoderIncremento() / 5)) / 100;
	}
	
	public void incrementarVida(Personagem personagem, int fatorIncremento) {
		personagem.quantidadeVida += fatorIncremento;
	}
	
	public abstract int getPoderIncremento();
	
}
