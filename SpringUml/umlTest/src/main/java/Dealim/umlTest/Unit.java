package Dealim.umlTest;

public class Unit {
	public String Name;
	public int health;
	
	public void Move() {
		System.out.println("유닛 움직인다.");
	}
	
	public void UnderAttack(Charactor charactor) {
		System.out.println("유닛 공격 받는다.");
	}
	
}
