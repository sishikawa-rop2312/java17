package java17;

import java.io.FileWriter;

public class Code17_4 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("hello");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("何らかのエラーが発生しました");
		}
	}
}
