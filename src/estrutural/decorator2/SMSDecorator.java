package estrutural.decorator2;

public class SMSDecorator extends NotifierBaseDecorator{

	public SMSDecorator(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send() {
		System.out.println("Enviando mensagem para número 1234");
		System.out.println("Atenção seu gás de cozinha está aberto");
	}

}
