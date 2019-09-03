public class Marine {
	private String Name;
	public int health;
	protected int attackPower;
	
	private void Move() {
		System.out.println("마린 운직인다");
	}
	
	public void Attack() {
		System.out.println("마린 공격한다");
	}
	
	public void UnderAttack(char c1) {
		System.out.println("마린 언더 어택?");
	}
	
	

}
