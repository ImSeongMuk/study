package Dealim.umlTest.uml.strategy;

public class Tiger extends Animal{
	
	public Tiger() {
		// TODO Auto-generated constructor stub
		cry = new TigerCry();
		fly = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("호랑이");
	}
	
	
}
