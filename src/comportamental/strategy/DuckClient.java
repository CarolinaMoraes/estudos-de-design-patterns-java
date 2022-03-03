package comportamental.strategy;

public class DuckClient {

	private IQuackStrategy quackStrategy;
	

	public DuckClient(IQuackStrategy quackStrategy) {
		this.quackStrategy = quackStrategy;
	}

	public void executarQuack() {	
		quackStrategy.quack();
	}
}
