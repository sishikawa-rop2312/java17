package java17;

import java.io.FileWriter;
import java.io.IOException;

public class Code17_4_2 {
	// P.680の例外の伝播確認
	// throwsでエラーはなくなるがこの書き方はダメ！かならずtry-catchを行う！！！！
	public static void main(String[] args) throws IOException {
		save();
	}
	
	public static void save() throws IOException {
		FileWriter fw = new FileWriter("data.txt");
	}
}
