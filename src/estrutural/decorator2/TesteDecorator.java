package estrutural.decorator2;

public class TesteDecorator {
	
	public static void main(String [] args) {
		Notifier notifyingStack = new Notifier();
		
		// Isso poderia vir de uma validação externa
		boolean facebookEnabled = true;
		boolean smsEnabled = true;
		
		if(facebookEnabled) {
			notifyingStack = new FacebookDecorator(notifyingStack);
		}
		
		if(smsEnabled) {
			notifyingStack = new SMSDecorator(notifyingStack);
		}
	}
}
