//Program to check if a number is Special number or not
// Special number: sum of factorial of its digits is equal to the original number
//Eg: 145, 1!+4!+5!=145
import  java.util.Scanner;
public  class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int number, remainder, factorial = 1, sum = 0, temporaryNumber;
        
        System.out.println("Enter number:");
        number = sc.nextInt();
        
        temporaryNumber = number;

        while (temporaryNumber > 0) {
            remainder = temporaryNumber % 10;
            for (int i = 1; i <= remainder; i++) {
                factorial *= i;
            }
            sum += factorial;
            factorial=1;
            temporaryNumber = temporaryNumber / 10;
        }
            if (sum != number)
                System.out.println("Not Special number");
            else
                System.out.println("Special number");
    }
}
