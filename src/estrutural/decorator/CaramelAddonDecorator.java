package estrutural.decorator;

public class CaramelAddonDecorator extends AddonDecorator{

	private Beverage beverage;
		
	public CaramelAddonDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public Double cost() {
		return this.beverage.cost() + 0.5;
	}

}
