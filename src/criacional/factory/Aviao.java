package criacional.factory;

public class Aviao implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Calculando rota a�rea");
		System.out.println("Alocando v�o");
		System.out.println("Entrega agendada");
	}

}
