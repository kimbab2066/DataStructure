package 권오흠자료구조.Chap1;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		int tmp = arr[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = tmp;
		System.out.println(Arrays.toString(arr));
	}// end of main
}// end of class