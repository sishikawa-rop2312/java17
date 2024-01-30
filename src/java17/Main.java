package java17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 3, 1, 5 };
		System.out.print("入力>>");
		try {
			int index = new Scanner(System.in).nextInt();
			System.out.println(nums[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("存在しないインデックスです");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("整数で入力してください");
		} finally {
			System.out.println("終了");
		}
	}
}
