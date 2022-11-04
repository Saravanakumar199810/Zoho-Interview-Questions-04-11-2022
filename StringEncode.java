package ZohoInterviewQuestions;

import java.util.Scanner;

public class StringEncode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="asxz";//sc.next();
		int n=4;//sc.nextInt();
		int a;
		String s1="";
		for(int i=0;i<str.length();i++) {
			a=str.charAt(i)+n;
			if(a>'z') a=a-'z'+'a'-1;
			s1+=(char)a;
		}
		System.out.println(s1);
	}

}
