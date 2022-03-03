package comportamental.command;

public class Invoker {
	
	public Invoker(ICommand on, ICommand off) {
		this.on = on;
		this.off = off;
	}

	private ICommand on;
	
	private ICommand off;
	
	public void clickOn() {
		this.on.execute();
	}
	
	public void clickOff() {
		this.off.execute();
	}
}
