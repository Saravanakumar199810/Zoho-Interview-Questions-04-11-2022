package ZohoInterviewQuestions;

import java.util.Scanner;

public class StringEncode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="y1Xz98C";//sc.next();
		int n=4;//sc.nextInt();
		int a;
		String s1="";
		for(int i=0;i<str.length();i++) {
			a=str.charAt(i)+n;
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(a>'z') a=a-'z'+'a'-1;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				if(a>'9') a=a-'9'+'0'-1;
			}else {
				if(a>'Z') a=a-'Z'+'A'-1;
			}
			s1+=(char)a;
		}
		System.out.println(s1);
	}

}
