package criacional.factory;

public abstract class Correio {
	
	private Transporte transporte;
	
	public void planejarEntrega() {
		this.transporte = this.criarFormaDeTransporte();
		this.transporte.entregar();
	}
	
	public abstract Transporte criarFormaDeTransporte();
}
