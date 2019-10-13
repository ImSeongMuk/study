package Dealim.uml.decorator.cafe;

public class Espresso extends Beverage{
	
	public Espresso() {
		// TODO Auto-generated constructor stub
		this.description = "에소프레소";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}
	
}
