package java17;

public class Code17_13 {
	public static void main(String[] args) {
		try {
			throw new TestException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
