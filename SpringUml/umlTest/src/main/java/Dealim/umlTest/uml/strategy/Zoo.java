package Dealim.umlTest.uml.strategy;

public class Zoo{

	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Eagle eagle = new Eagle();
		Turtle turtle = new Turtle();
		
		tiger.display();
		tiger.pserformCry();
		tiger.performFly();
		System.out.println("---------------");
		eagle.display();
		eagle.pserformCry();
		eagle.performFly();
		System.out.println("---------------");
		turtle.display();
		turtle.pserformCry();
		turtle.performFly();
		

	}

}
