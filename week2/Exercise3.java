package week2;

import java.util.Scanner;

public class Exercise3 {
     public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("");
        int seconds = scanner.nextInt();
        int S=seconds%60;
        int H=seconds/60;
        int M= H%60;
         H= H/60;
        System.out.print(H+":"+M+":"+S);
     }
}
