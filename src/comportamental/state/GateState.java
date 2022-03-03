package comportamental.state;

public interface GateState {

	public void enter();

	public void pay();

	public void payOk();

	public void payFailed();
}
