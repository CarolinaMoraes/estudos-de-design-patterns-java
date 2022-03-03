package estrutural.decorator2;

public class SMSDecorator extends NotifierBaseDecorator{

	public SMSDecorator(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send() {
		System.out.println("Enviando mensagem para n�mero 1234");
		System.out.println("Aten��o seu g�s de cozinha est� aberto");
	}

}
