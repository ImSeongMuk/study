package Dealim.uml.sample;

//싱글톤 패턴
public class SampleClass {
	private static SampleClass sampleClass;
	
	public static SampleClass getInstance() {
		//new 를 한번만 할 수 있도록 if문을 이용한다.
		if(sampleClass == null) {
			sampleClass = new SampleClass();
		}
		
		return sampleClass;
	}
	
	public void samplPrint() {
		System.out.println("print sample");
	}
	
}
