package conditional3;

public class fibonacci {

	public static void main(String[] args) {
		
        int x=0, y=1,z=0;
        for(int i=0; i<10; i++ ) {
		 z= x+y;
		System.out.println(x);
		
		x=y;
		y=z;
        }
		

	}

}
