import java.util.*;

public class exerciciLletresRepetides {

	public static void main(String[] args) {
		
		System.out.println("Step 1" + "\n");

		char [] myName = new char[5];
		myName[0]='o';
		myName[1]='r';
		myName[2]='i';
		myName[3]='o';
		myName[4]='l';

		for (int i=0; i<myName.length; i++) {
			System.out.println(myName[i]);
		}

		
		
    	System.out.println("\n" + "Step 2" + "\n");

		char [] arrName1 ={'o','r','i','o','l'};
		List<Character> arrList1 = new ArrayList<Character>();

		for (int i=0; i<arrName1.length; i++) {
			
			if (arrName1[i]=='a' || arrName1[i]=='e' || arrName1[i]=='i' || arrName1[i]=='o' || arrName1[i]=='u') {
				System.out.println("Vowel");
			} 
			
			else if (arrName1[i]=='1' || arrName1[i]=='2' || arrName1[i]=='3' || arrName1[i]=='4' || arrName1[i]=='5' || arrName1[i]=='6' || arrName1[i]=='7' || arrName1[i] == '8' || arrName1[i] == '9' || arrName1[i] == '0') {
				System.out.println("Person names don't have numbers");
			} 
			
			else {
				System.out.println("Consonant");
			}
		}

		
		
		System.out.println("\n" + "Step 3" + "\n");

		String myname2 = "oriol";
        List<Character> arrList = new ArrayList<Character>();

		Map<Character,Integer> charMap = new LinkedHashMap<Character, Integer>();

		for(Character i : myname2.toCharArray()){
			if(charMap.containsKey(i)) {
				charMap.put(i, charMap.get(i) + 1);
			} else {
				charMap.put(i, 1);
			}
		}

		System.out.println(charMap);

		
		
    	System.out.println("\n" + "Step 4" + "\n");

		char [] arrName = {'o','r','i','o','l'};
		List<Character> arrNameList = new ArrayList<Character>();

		char [] arrSurname ={'c','a','n','a','d','e','s'};
		List<Character> arrSurnameList = new ArrayList<Character>();

		List<Character> fullNameList = new ArrayList<Character>();

		fullNameList.addAll(arrNameList);
		fullNameList.add(' ');
		fullNameList.addAll(arrSurnameList);

		/*
		List<Character> fullNameList = new ArrayList<Character>();
		
		for (int j = 0; j < arrName.length; j++) {
			fullNameList.add(arrName[j]);
		}
		
		fullNameList.add(' ');
		
		for (int k = 0; k < arrSurname.length; k++) {
			fullNameList.add(arrSurname[k]);
		}
		*/

		System.out.print(fullNameList);

	}

}
