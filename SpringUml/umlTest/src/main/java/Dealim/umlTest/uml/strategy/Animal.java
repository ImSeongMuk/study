package Dealim.umlTest.uml.strategy;

public abstract class Animal {
	ICry cry;
	IFly fly;
	
	public Animal(){
		
	}
	
	public void display(){
		System.out.println();
	}
	
	public void move(){
		System.out.println();
	}
	
	public void pserformCry(){
		cry.cry();
	}
	
	public void performFly(){
		fly.fly();
	}
	
	
	
}
