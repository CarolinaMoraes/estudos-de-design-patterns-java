package comportamental.state;

public class ClosedGateState implements GateState {

	private Gate gate;

	public ClosedGateState(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payOk() {
		this.gate.changeState(new OpenGateState(gate));
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub

	}

}
