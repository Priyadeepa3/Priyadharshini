package Practice;

import java.util.Scanner;

public class ThirdProgram {

   
    public static void printOddNumbers(int limit) {
        
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
           
            if (i + 2 <= limit) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        if (limit > 0) {
            printOddNumbers(limit);
        }
        
        
    }
}
