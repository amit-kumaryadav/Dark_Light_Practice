import java.util.Arrays;

public class CharacterCount {

	public static void main(String[] args) {
		String s1 = "aabbcccc";
		int count[] = new int[256];
		char[] charArray = s1.toCharArray();
		Arrays.fill(count, 0);
		for (Character ch : charArray) {
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				System.out.println((char) i + "  " + count[i]);
		}
	}

}
