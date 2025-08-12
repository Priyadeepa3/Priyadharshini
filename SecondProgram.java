package Practice;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
			

	        int number = 1; // first odd number
	        for (int i = 1; i <= count; i++) {
	            System.out.print(number);
	            if (i < count) {System.out.print(", ");
	             
	            number += 2;
	            }
	           
	        }
		
	}

}
