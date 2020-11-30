package com.company;

public class Invest {

    public static void main(String[] args) {
	    float total = 140000;
	    System.out.println("Original investmen : $" + total);

	    // Increase by 40 percent the first year
	    total = total + (total * .4F);
	    System.out.println("After one year: $" + total);

	    // Loses $1,500 the second year
	    total = total - 1500F;
	    System.out.println("After two years: $" + total);

	    // Increase by 12 percent the third year
	    total = total + (total * .12F);
	    System.out.println("After three years: $" + total);
    }
}
