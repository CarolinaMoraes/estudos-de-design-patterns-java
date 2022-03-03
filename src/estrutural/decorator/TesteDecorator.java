package estrutural.decorator;

public class TesteDecorator {

	public static void main(String[] args) {

		Beverage espresso = new Espresso();
		
		CaramelAddonDecorator caramel = new CaramelAddonDecorator(espresso);
		
		Double finalPrice = caramel.cost();
		System.out.println(finalPrice);
	}

}
