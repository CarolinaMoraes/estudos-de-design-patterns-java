package criacional.factory;

public class CorreioTerrestre extends Correio {

	@Override
	public Transporte criarFormaDeTransporte() {
		return new Caminhao();
	}

}
