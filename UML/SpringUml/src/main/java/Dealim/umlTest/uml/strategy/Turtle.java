package Dealim.umlTest.uml.strategy;

public class Turtle extends Animal{
	
	public Turtle() {
		// TODO Auto-generated constructor stub
		cry = new CryNoWay();
		fly = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("거북이");
	}
	
	
}
