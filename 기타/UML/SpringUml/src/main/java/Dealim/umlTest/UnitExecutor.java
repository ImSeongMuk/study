package Dealim.umlTest;

public class UnitExecutor {
	
	public static void main(String[] args) {
		Unit u = new Unit();
		u.Move();
		
		Marine d = new Marine();
		d.Name = "marine1";
		d.Move();
		d.Attack();
		
		Medic m = new Medic();
		m.Name="medic";
		m.move();
		
	}
}
