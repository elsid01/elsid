package SbaFour;

import java.io.CharArrayReader;
import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class CompressionTechinics {

	public static void main(String[] args) {
		//Declare variables  
		String  name=" " ;
		String Compressed="";
		int count=1;
		
		//Scanner object
		Scanner type = new Scanner(System.in);
		
        //Ask user for a word
		System.out.println("Enter a word ");
        
		//Prompt the  the word
		name = type.next();
		
		//for loop to go through the length of the word
		for(int i = 0; i < name.length()-1; i++) 
		{
			//check if the character is similar to the next and add 1 to the count
			if( name.charAt(i)==name.charAt(i+1) ) {
				count++;
				//Compressed+=count;
			}
			//if the first condition is faults then do this
			else {
				if (count!=1) {
					Compressed=Compressed+name.charAt(i)+count;
					count=1;
					}
				else if(count==1){
					Compressed+=name.charAt(i);
				}
				
			}
	}
		//if the count is greater than 1 
		if (count > 1) {
			Compressed+=name.charAt(name.length()-1) + "" + count;			
		} else {
			Compressed+=name.charAt(name.length()-1);
		}
		//Print the compressed word
		System.out.println(Compressed);
		
		
		
		
		
		
		
		
		
		
		
			
		
}
}












