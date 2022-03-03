package estrutural.decorator2;

public class FacebookDecorator extends NotifierBaseDecorator{

	public FacebookDecorator(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send() {
		System.out.println("Entrando no ambiente do facebook");
		System.out.println("Você esqueceu seu gás de cozinha aberto");
	}

}
