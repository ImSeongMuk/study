package Dealim.umlTest;

public class Marine extends Unit {
	
	protected int attackPower;
	
	
	public void Move() {
		System.out.println(Name+" 움직인다");
	}
	
	public void Attack() {
		System.out.println("마린 어택");
	}
	
	public void UnderAttack(Charactor charactor) {
		System.out.println(Name+ "공격 받는다");
		
	}
	
	//클래스틑 다은 클래스와 연관 관계 를 가지고 있는다
	
	

}
