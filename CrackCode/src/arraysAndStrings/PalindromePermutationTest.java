package arraysAndStrings;

import java.math.BigInteger;

public class PalindromePermutationTest {

	public static void main(String[] args) {
		String input1 = " ";
		String input2 = "Hello";
		String input3 = "acbba";
		String input4 = "Maamd";
		String input5 = "Recarac";
		PalindromePermutation palindromePermutation = new PalindromePermutation();
		System.out.println(input1+" is permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(input1));
		System.out.println(input2+" is permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(input2));
		System.out.println(input3+" is permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(input3));
		System.out.println(input4+" is permutation of permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(input4));
		System.out.println(input5+" is permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(input5));
		System.out.println("null is permutation of palindrome: "+palindromePermutation.checkPalindromePermutation2(null));
	}
}
