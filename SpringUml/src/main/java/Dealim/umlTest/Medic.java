package Dealim.umlTest;

public class Medic extends Unit {
	public void move() {
		System.out.println("메딕 움직인다");
	}
	
	public void UnderAttack() {
		System.out.println("메딕 공격 받는다");
	}
	
	public void healing(Charactor charactor) {
		System.out.println("회복시킨다");
	}
}