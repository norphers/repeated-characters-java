package exer2;

import java.util.ArrayList;
import java.util.List;

public class Stage2 {

	static char[] name = {'j','o','h','n'};
	static List<Character> nameCharList = new ArrayList<Character>();
	
	public static void main(String[] args) {
		
		arrayToList(name);
		System.out.println(nameCharList);
		distinguishCharacter(nameCharList);
		
	}
	
	public static void distinguishCharacter(List<Character> list) {
		for(char one : list) {
			if(isVowel(one)) {
				System.out.println("vowel");
			} else if (Character.isDigit(one)) {
				System.out.println("names of persons don't have numbers");
			} else {
				System.out.println("consonant");
			}
		}
	}
	
	public static void arrayToList(char[] array) {
		for(int i=0; i<array.length; i++) {
			nameCharList.add(array[i]);
		}
	}
	
	public static boolean isVowel(char character) {
		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u') {
			return true;
		} else {
			return false;
		}
	}

}
