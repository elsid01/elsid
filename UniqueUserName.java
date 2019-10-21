package SbaFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueUserName {

	public static void main(String[] args) {
		ArrayList<String> usernames= new ArrayList<String>();
		HashMap<String, Integer> uniqueUserNames = new HashMap<String, Integer>();
		String username;
		Scanner type = new Scanner( System.in);
		
		do {
			username = type.nextLine();
			// If the input is not empty, add the username to the usernames ArrayList
			if (!username.trim().isEmpty()) {
				usernames.add(username);				
			}
		} while (!username.trim().isEmpty());
		
		for(String name :usernames) {
			if(uniqueUserNames.containsKey(name)) {
				
			}
		}
	}

}
