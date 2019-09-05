package Dealim.uml.pizza;

public abstract class SimplePizzs {
	public String description = "empty";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract int cost();
}
