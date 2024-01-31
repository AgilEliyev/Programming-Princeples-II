package week2; 

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print(" ");
        int firstNumber = scanner.nextInt();
        
       
        System.out.print(" ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        
      
        System.out.println(firstNumber +  secondNumber );
        
       
        scanner.close();
    }
}
