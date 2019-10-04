package com.adj01w2Methods.main;   

public class Strings {

	public static void main(String[] args) {
		String input = "racecar";
		
/*		
		int x = input.length(); 
		System.out.println("the length of the string is = " + x);
		System.out.println("the length of the string is = " + input.length());

		
		input.charAt(0);
		input.charAt(1);   
		input.charAt(2);
		input.charAt(3);
		input.charAt(4);
		input.charAt(5);
		input.charAt(6);
		
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(1));
		System.out.println(input.charAt(2));
		System.out.println(input.charAt(3));
		System.out.println(input.charAt(4));
		System.out.println(input.charAt(5));
		System.out.println(input.charAt(6));
		
		System.out.println("using the loop");
		for (int i= 0;i<x;i++) 
			System.out.println(input.charAt(i));
		
		System.out.println("*********");
		for (int i= 0;i<=input.length()-1;i++) 
			System.out.println(input.charAt(i));
		
		System.out.println("*********");
		int counter = 0;
		System.out.println("a is at INDEX-position(s):");
		for (int i= 0;i<=input.length()-1;i++) {
			if (input.charAt(i) == 'a') {
				System.out.println(i);
				counter=counter + 1; 
			}  
		}
		System.out.println("a = "+counter+" times");
*/
		int result = findCharNumberTimes("racecar",'a');  //2 // 0
		System.out.println("the char 'a' is " + result + " times in the word = racecar" );

	}
	
	public static int findCharNumberTimes( String wordToScan, char charToFind) {
		int counter=0;
		for (int i=0;i<=wordToScan.length()-1;i++) {
			if(wordToScan.charAt(i) == charToFind ) {
				counter++;
			}
		}
		return counter;
	}
	
	
	
	
	

}
