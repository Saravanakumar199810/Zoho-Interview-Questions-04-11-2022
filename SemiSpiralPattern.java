package ZohoInterviewQuestions;

import java.util.Scanner;

public class SemiSpiralPattern {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int number = 6; //sc.nextInt();
		int a[][] = new int[number][number];
		double num = (number / 2.0) + (0.5);
		int num1 = (int) (number * num);
		int num2 = number + 1, i, j;
		int r1 = 0, r2 = number - 1, c1 = 0, c2 = number - 1;
		for (i = 0; i < number; i++) {
			a[i][i] = i+1;
		}
		while (num2 <= num1) {
			for (i = c2 - 1; i >= c1; i--) {
				if (a[i][c2] == 0)
					a[i][c2] = num2++;
			}
			for (i = r2 - 1; i >= c1 + 1; i--) {
				if (a[r1][i] == 0)
					a[r1][i] = num2++;
			}
			int m = 1;
			for (i = r1 + 1; i <= r2 - 1; i++) {
				if (a[m][i + 1] == 0)
					a[m][i + 1] = num2++;
				m++;
			}
			r1++;
			c1++;
			r2--;
			c2--;
		}

		for (i = 0; i < number; i++) {
			for (j = 0; j < number; j++) {
				if (a[i][j] == 0)
					System.out.print("    ");
				else
					System.out.print( a[i][j] + "   ");
			}
			System.out.println();
		}

	}

}
