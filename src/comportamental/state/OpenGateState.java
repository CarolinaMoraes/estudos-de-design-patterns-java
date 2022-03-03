package comportamental.state;

public class OpenGateState implements GateState {

	private Gate gate;
		
	public OpenGateState(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void enter() {
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void pay() {
		
	}

	@Override
	public void payOk() {
	}

	@Override
	public void payFailed() {
		
	}

}
