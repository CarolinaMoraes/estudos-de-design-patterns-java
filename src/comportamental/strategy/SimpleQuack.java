package comportamental.strategy;

public class SimpleQuack implements IQuackStrategy{

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
