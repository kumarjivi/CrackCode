package arraysAndStrings;
/**
 * @author Kumar
 * There are three types of edits performed on String: add a char, remove a char, and
 * replace a char. Given two Strings, check if one String is one (or zero) edit away 
 * from the other one.
 */
public class OneAway {
	
	public boolean isOneEditAway(String str1, String str2) {
		boolean isOneAway = false;
		if(str1 == str2) {
			return true;
		}
		if(str1 != null && str2 != null) {
			if(str1.length() == str2.length()) {
				isOneAway = isOneAway(str1, str2);
			} else if(str1.length() +1 == str2.length()) {
//				isOneAway = isOneAddAway(str1, str2);
				isOneAway = isOneAway(str1, str2);
			} else if(str2.length() + 1 == str1.length()) {
//				isOneAway = isOneAddAway(str2, str1);
				isOneAway = isOneAway(str2, str1);
			}
		}
		return isOneAway;
	}
	/**
	 * Method to check if str1 is one replace edit away from str2.
	 * @param str1
	 * @param str2
	 * @return true if str1 is one replace edit away from str2.
	 */
	protected boolean isOneReplaceAway(String str1, String str2) {
		//str1 and str2 should must same length 
		boolean isOneRepAway = true;
		if(str1 != null && str1.length() >0 && str2 != null && str2.length() > 0) {
			int index = 0;
			int len1 = str1.length();
			boolean metOneDiff = false;
			while(index < len1) {
				if(str1.charAt(index) != str2.charAt(index)) {
					if(!metOneDiff) {
						metOneDiff = true;
					} else {
						isOneRepAway = false;
						break;
					}
				}
				index++;
			}
		} else {
			return false;
		}
		return isOneRepAway;
	}
	
	/**
	 * check if str1 + one character = str2.
	 * @param str1
	 * @param str2
	 * @return true if str1 + one character = str2.
	 */
	protected boolean isOneAddAway(String str1, String str2) {
		boolean isOneAddAway = true;
		if(str1 != null && str2 !=null && (str1.length() + 1 == str2.length())) {
			int indexStr1 = 0;
			int indexStr2 = 0;
			int len1 = str1.length();
			int len2 = str2.length();
			boolean metOneDiff = false;
			while(indexStr1<len1) {
				if(str1.charAt(indexStr1) != str2.charAt(indexStr2)) {
					if(!metOneDiff) {
						metOneDiff = true;
						indexStr1--;
					} else {
						isOneAddAway = false;
						break;
					}
				}
				indexStr1++;
				indexStr2++;
			}
		} else {
			return false;
		}
		return isOneAddAway;
	}
	
	/**
	 * Consolidated  method of isOneAddAway and isOneReplaceAway
	 * @param str1
	 * @param str2
	 * @return true if str1 is one edit away from str2.
	 */
	protected boolean isOneAway(String str1, String str2) {
		//str1 and str2 should must same length 
		boolean isOneRepAway = true;
		if(str1 != null && str1.length() >0 && str2 != null && str2.length() > 0) {
			int indexStr1 = 0;
			int indexStr2 = 0;
			int len1 = str1.length();
			int len2 = str2.length();
			boolean metOneDiff = false;
			while(indexStr1 < len1) {
				if(str1.charAt(indexStr1) != str2.charAt(indexStr2)) {
					if(!metOneDiff) {
						metOneDiff = true;
						if(len1 + 1 == len2) {
							indexStr1--;
						}
					} else {
						isOneRepAway = false;
						break;
					}
				}
				indexStr1++;
				indexStr2++;
			}
		} else {
			return false;
		}
		return isOneRepAway;
	}
}
