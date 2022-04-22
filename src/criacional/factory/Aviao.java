package criacional.factory;

public class Aviao implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Calculando rota aérea");
		System.out.println("Alocando vôo");
		System.out.println("Entrega agendada");
	}

}
