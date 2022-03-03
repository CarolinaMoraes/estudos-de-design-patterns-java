package comportamental.strategy;

public class TestarStrategy {

	public static void main(String[] args) {

		DuckClient wildDuck = new DuckClient(new LoudQuack());
		wildDuck.executarQuack();
		
		DuckClient pondDuck = new DuckClient(new SimpleQuack());
		pondDuck.executarQuack();
	}

}
