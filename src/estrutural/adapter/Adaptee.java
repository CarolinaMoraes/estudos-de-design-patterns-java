package estrutural.adapter;

public class Adaptee {
	
	public void specificRequest(int signatureThatOnlyExistsHere) {
		System.out.println("We did it, joe!");
		System.out.println(signatureThatOnlyExistsHere);
	}
}
