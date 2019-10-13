package Dealim.uml.sample;
//싱글톤 패턴
public class MainSample {
	public static void main(String[] args) {
		//getInstance 에서 만들어지 객체를 return해준다.
		//
		SampleClass s =SampleClass.getInstance();
		
		s.samplPrint();
		
		///복잡
		///복잡
		///복잡
		
		//다시 선언해도 메모리를 추가하지 않는다.
		s = SampleClass.getInstance();
		s.samplPrint();
		
		
		
	}
}
