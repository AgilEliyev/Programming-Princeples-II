package week2;

public class Exercise2 {
    public static void main(String[] args) {
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        int sum= num1+num2;
        int substraction= num1-num2;
        int product = num1*num2;
        int division = num1/num2;
        int remainder = num1 % num2;
        System.out.println(sum);
        System.out.println(substraction);
        System.out.println(product);
        System.out.println(division);
        System.out.println(remainder);
    }
}