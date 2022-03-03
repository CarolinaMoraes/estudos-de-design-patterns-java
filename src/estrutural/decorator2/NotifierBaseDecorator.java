package estrutural.decorator2;

public abstract class NotifierBaseDecorator extends Notifier{
	
	Notifier notifier;

	public NotifierBaseDecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public abstract void send();
}
