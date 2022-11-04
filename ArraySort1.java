package ZohoInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort1 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}*/
		int[] arr = {1,2,0,4,5,0,6,0};
		int[] arr2 = new int[arr.length];
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr2[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
