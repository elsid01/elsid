package conditional3;
import java.util.Scanner;

public class Palendrum {
	public static void main(String[] args) {
	
	Scanner type = new Scanner(System.in);
	
	String name;
	boolean flag= false;
	System.out.println("Enter a word to check");
	
	name = type.next();
	int l=name.length()-1;
	for(int i=0; i<=l; i++) {
		
		if(name.charAt(i)==name.charAt((l-i))) {
			
			flag = true;
		}
		else
		{
			flag =false;
			break;
		}
		
	}	
	
	if (flag) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
	
}
}