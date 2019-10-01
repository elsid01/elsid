package logicConditions;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int line = 0 , count=1;


		
		
		while(count<=110) {
			//System.out.println(count);

			if (count%3!=0 && count%5!=0 && count%7!=0 )
				System.out.print(count + " ");
			else {
				if (count%3==0)
					System.out.print("Coza");
				if (count%5==0)
					System.out.print("Loza");
			    if (count%7==0)
					System.out.print("Woza");
			    System.out.print(" ");
			}
			
			if ( count%11==0)
				System.out.print("\n");
			
			count++;

		}

	}
}