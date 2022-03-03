package comportamental.strategy;

public class LoudQuack implements IQuackStrategy {

	@Override
	public void quack() {
		System.out.println("QUAAAACK");
	}

}
