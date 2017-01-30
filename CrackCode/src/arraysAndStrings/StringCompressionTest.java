package arraysAndStrings;

public class StringCompressionTest {

	public static void main(String[] args) {
		StringCompression stringCompression = new StringCompression();
		System.out.println(stringCompression.getCompressedString("abc"));
		System.out.println(stringCompression.getCompressedString("abbbbbbc"));
		System.out.println(stringCompression.getCompressedString("a"));
		System.out.println(stringCompression.getCompressedString("abvvcbbbccccc"));
		System.out.println(stringCompression.getCompressedString(null));
		System.out.println(stringCompression.getCompressedString("   "));
	}

}
