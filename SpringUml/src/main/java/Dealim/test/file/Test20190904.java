package Dealim.test.file;

public class Test20190904 {
	public static int largest(int []list) {
		int index,max=Integer.MIN_VALUE;
		for(index=0;index < list.length;index++) {
			if(list[index]>max) {
				max = list[index];
			}
		}
		return max;
	}
	
}
