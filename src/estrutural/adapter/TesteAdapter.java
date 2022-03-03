package estrutural.adapter;

public class TesteAdapter {

	public static void main(String[] args) {

		ITarget target = new Adapter(new Adaptee());
		target.request();
	}

}
