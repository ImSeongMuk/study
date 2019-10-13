package Dealim.umlTest.uml.strategy;

public class Eagle extends Animal{
	public Eagle() {
		// TODO Auto-generated constructor stub
		fly = new FlyWithWings();
		cry = new BirdCry();
	}
	
	public void display(){
		System.out.println("독수리");
	}

	
}
