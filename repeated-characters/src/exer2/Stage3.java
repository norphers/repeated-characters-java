package exer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stage3 {
	
	static char[] name = {'j','n','o','h','n','a','p','p','p'};
	static List<Character> nameCharList = new ArrayList<Character>();
	static Map<Character,Integer> dictionary = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		
		arrayToList(name);
		//System.out.println(nameCharList);
		dictionaryGenerator(nameCharList);
		System.out.println(dictionary);
		
	}
	
	public static void arrayToList(char[] array) {
		for(int i=0; i<array.length; i++) {
			nameCharList.add(array[i]);
		}
	}
	
	public static void dictionaryGenerator(List<Character> list) {
		for(char one : list) {
			if(dictionary.containsKey(one)) {
				int number = dictionary.get(one)+1;
				dictionary.replace(one, number);	
			} else {
				dictionary.put(one, 1);
			}
		}
		
	}

}
