package arraysAndStrings;
/***
 * 
 * @author Kumar
 * Assume you have a method isSubstring  which checks if one word is a substring of the other.
 * Given 2 strings s1 and s2, write a method which checks if s2 is a rotation of string s1, using
 * only one call to method isSubstring. 
 */
public class StringRotation {
	public boolean isRotation(String s1, String s2) {
		if(s1==null || s2==null || s1.length()==0 || s2.length()==0) {
			return false;
		}
		StringBuilder str = new StringBuilder();
		str.append(s1).append(s2);
		return str.toString().contains(s2);
//		return isRotation;
	}
	/*
	 * method to check if the substring is a substring of the string word.
	 */
	protected boolean isSubstring(String substring, String word) {
//		boolean isSub = true;
		return word.contains(substring);
//		return isSub;
	}
}
