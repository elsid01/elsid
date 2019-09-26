package ndAssign;

import java.util.Scanner;

public class IbmCalcultor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner type = new Scanner(System.in);
        
        double weight, height, IBM;
        
        System.out.println(" Please give us your weight in kg and  "); 
        weight = type.nextDouble();
        
        System.out.println(" And your height in meters : ");
        height = type.nextDouble();
        
        IBM = weight/(height*height);
        
        System.out.println(" Your IBM is " + IBM);
	}

}
