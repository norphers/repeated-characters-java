package exer2;

public class Stage1 {

	static char name[] = {'j','o','h','n'};
	
	public static void main(String[] args) {
		
		loopThroughArray(name);

	}

	public static void loopThroughArray(char[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
