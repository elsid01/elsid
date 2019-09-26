package com.adj0105Slide52.main;

import java.text.DecimalFormat;

/*
 * Requirement:
 * Write a program that displays 
 * the sales tax with two digits 
 * after the decimal point. 
 * Use current NY sales tax rate - 8.875%
 */

public class CalculatorSalesTax {

	public static void main(String[] args) {
		
		final double SALESTAXRATE = 0.08875;
		
		// step 1 - Declare a variable sales
		double sales = 100;
		
		// step 2 - Assign a value 100 to sales variable
		sales = 100;
		
		// step 3 - Calculate the sales tax base on the value of "sales" variable
		double salesTax;
//		salesTax = sales * 0.08875;
		salesTax = sales * SALESTAXRATE;
		
		
		// step 4 - print the sales 
		System.out.println("Sales = " + sales);
		
		// step 5 - print the sales tax
		System.out.println("Sales Tax = " + salesTax);
		
		
		System.out.println("***********");
		
		sales = Math.round(100.6654*100.0)/100.0;

		System.out.println("sales = " + sales);
		
		double salesTaxRounded;
		salesTaxRounded = Math.round(salesTax*100.0)/100.0;

		System.out.println("sales Tax (rounded) = " + salesTaxRounded);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Sales Tax (using DecimalFormat) = " + df.format(salesTax));
		
		
		System.out.println("***********");


		// printf
		
		
//		System.out.printf("text %?? text %?? text %??", value1, value2, value3 );
//		
//		System.out.printf("text %?? %?? %?? text ", value1, value2, value3 );
		
		System.out.println("***********");

		
//		System.out.printf("Sales (using specifier d) = %d \n",sales );
		
		System.out.printf("Sales Tax (using specifier f)= %f \n",salesTax );
		System.out.printf("Sales Tax (using specifier f with precision) = %.2f \n",salesTax );

        System.out.printf("Sales are %f and Sales Tax is %.4f ", sales, salesTax);

		System.out.println("\n***********");

        int n;
		double m;
		
		m = 100.12345;
		
		n = (int) (m *100);
		double result = n / 100;
		
		System.out.println("n = " + n);
		System.out.println("m = " + m);
		
		float o;
		o = 100.12345f;
		System.out.println("o = " + o);
        n = (int)o;
		System.out.println("n = " + n);

//		https://javarevisited.blogspot.com/2017/01/how-to-convert-double-to-int-in-java.html
		
		Double numberx;
		String name;
		Integer numbery;
		
	}

}
