package exer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stage4 {

	static char[] name = {'J','o','h','n'};
	static List<Character> nameCharList = new ArrayList<Character>();
	static List<Character> surnameCharList = new ArrayList<Character>();
	static List<Character> fullNameCharList = new ArrayList<Character>();
	static String surname = "Doe";
	static Map<Character,Integer> dictionary = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		
		arrayToList(name);
		stringToList(surname);
		
		fullCharNameGen(nameCharList, surnameCharList);
		
		System.out.println(fullNameCharList);
		
	}
	
	public static void fullCharNameGen(List<Character> list1, List<Character> list2) {
		for(char one : list1) {
			fullNameCharList.add(one);
		}
		fullNameCharList.add(' ');
		for(char one : list2) {
			fullNameCharList.add(one);
		}
	}
	
	public static void arrayToList(char[] array) {
		for(int i=0; i<array.length; i++) {
			nameCharList.add(array[i]);
		}
	}
	
	public static void stringToList(String string) {
		for(int i=0; i<string.length();i++) {
			surnameCharList.add(string.charAt(i));
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
