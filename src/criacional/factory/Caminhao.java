package criacional.factory;

public class Caminhao implements Transporte{

	@Override
	public void entregar() {
		System.out.println("Calculando rota terrestre");
		System.out.println("Alocando caminh�o");
		System.out.println("Entrega agendada");
	}

}
