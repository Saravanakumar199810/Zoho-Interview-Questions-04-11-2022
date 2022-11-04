package ZohoInterviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAccurence {

	public static void main(String[] args) {
		Map<Character, Integer> string1 = new HashMap<>();
		Map<Character, Integer> string2 = new HashMap<>();
		//Scanner sc = new Scanner(System.in);
		String str1="mom", str2="dad" ;//sc.next();
		for(int i=0;i<str1.length();i++) {
			string1.put(str1.charAt(i), string1.getOrDefault(str1.charAt(i), 1)+1);
		}
		for(int i=0;i<str2.length();i++) {
			string2.put(str2.charAt(i), string2.getOrDefault(str2.charAt(i), 1)+1);
		}
		if(Collections.max(string1.values())==Collections.max(string2.values())){
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	}

}
