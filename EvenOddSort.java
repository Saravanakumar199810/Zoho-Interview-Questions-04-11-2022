package ZohoInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class EvenOddSort {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}*/
		int[] arr = {0,1,2,3,4,5,6,7,8};
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)even.add(arr[i]);
			else odd.add(arr[i]);
		}
		
		int j=0,k=odd.size()-1;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(even.get(j));
				j++;
			}
			else { 
				System.out.print(odd.get(k));
				k--;
			}
		}
	}

}
