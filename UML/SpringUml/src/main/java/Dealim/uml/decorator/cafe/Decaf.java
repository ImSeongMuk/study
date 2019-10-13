package Dealim.uml.decorator.cafe;

public class Decaf extends Beverage{
	public Decaf() {
		// TODO Auto-generated constructor stub
		this.description = "Decaf";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3900;
	}
}
