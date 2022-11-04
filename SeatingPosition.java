package ZohoInterviewQuestions;

import java.util.Scanner;

public class SeatingPosition {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int n=65;//sc.nextInt();
		if(n%3==2)System.out.println("MS");
		else if(n%6==0 || n%6==1)System.out.println("WS");
		else System.out.println("AS");
	}

}
