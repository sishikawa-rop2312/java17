package java17;

import java.io.FileWriter;
import java.io.IOException;

public class Code17_1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void print() throws Exception {
//		
//	}
}
