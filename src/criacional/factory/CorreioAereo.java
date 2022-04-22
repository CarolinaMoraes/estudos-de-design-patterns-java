package criacional.factory;

public class CorreioAereo extends Correio {

	@Override
	public Transporte criarFormaDeTransporte() {
		return new Aviao();
	}

}
