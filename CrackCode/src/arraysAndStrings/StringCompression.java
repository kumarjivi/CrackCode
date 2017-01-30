package arraysAndStrings;
/**
 * @author Kumar
 * Implement a method to perform basic String Compression using the count of the repeated
 * Characters. If the "Compressed" string would not become smaller than the original String,
 * method should return the original String.
 */
public class StringCompression {
	public String getCompressedString(String input) {
		StringBuilder compressed = new StringBuilder();
		if(input != null && input.trim().length() > 0) {
			int currentCount = 1;
			int index = 1;
			int len = input.length();
			char prev = input.charAt(0);
			compressed.append(prev);
			char curr = prev;
			while(index < len) {
				curr = input.charAt(index);
				if(prev == curr) {
					currentCount++;
				} else {
					compressed.append(currentCount);
					prev = curr;
					compressed.append(prev);
					currentCount = 1;
				}
				index++;
			}
			if(compressed.length() >= len) {
				return input;
			}
		}
		return compressed.toString();
	}
}
