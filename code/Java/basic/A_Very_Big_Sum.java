import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long result = 0;
		int size = in.nextInt();
		long very_big_sum_array[] = new long[size];
		for (int i = 0; i < size; i++){
			very_big_sum_array[i] = in.nextLong();
		}
		for (int i = 0; i < size; i++){
			result += very_big_sum_array[i];
		}
		System.out.println(result);

	}
}