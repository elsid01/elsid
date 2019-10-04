package com.adj01w2Methods.main;

public class Palindrome {

	public static void main(String[] args) {

		String word1 = "race";
		String word2 = "";
		
		// reverse the word
		for (int i = word1.length()-1;i>=0;i-- ) {
			word2 = word2 + word1.charAt(i);
		}
		System.out.println("original word = " + word1);       
		System.out.println("reverse word = " + word2);
		
		
		System.out.println("result from the method");
		System.out.println(reverse(word1));
		
		System.out.println("********************");
		word1 = "madam";
		word2 = reverse(word1);
		if (word1.equals(word2))
			System.out.println("THIS IS A PALINDROME");
		else
			System.out.println("THIS IS NOT A PALINDROME");
		
		//*******************************
		System.out.println("$$$$$$$$$$$$$$");
		word1 = "madamXYZ";
		
		boolean result = isPalindrome(word1);
		if (result)  
			System.out.println("word1 is PALINDROME");
		else
			System.out.println("word1 is not PALINDROME");
		
		System.out.println(isPalindrome(word1)?"word1 is PALINDROME":"word1 is not PALINDROME");
		
				
	}
	
	public static boolean isPalindrome(String word) {
		String word2 = "";
		word2 = reverse(word);
		boolean flag = false;
		
		if (word.equals(word2)) 
			flag = true;
		else
			flag = false;
		
		return flag;
	}
	
	
	public static String reverse(String word1) {
		String word2 = "";
		// reverse the word
		for (int i = word1.length()-1;i>=0;i-- ) {
			word2 = word2 + word1.charAt(i);
		}
		return word2;
	}
	
	
	

}
