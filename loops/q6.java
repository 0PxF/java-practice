//Program to check if a 3 digits number is Armstrong number or not
// Armstrong number: sum of cubes of its digits equals to the original number
//Eg: 153, 1^3+5^3+3^3=153
import  java.util.Scanner;
public  class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       //Variables
        int number,remainder,sumOfDigits = 0,temporaryNumber;
        System.out.println("Enter number:");
        number= sc.nextInt();
        if((number<100) || (number>999)){
            System.out.println("Enter a three digit number!");
        }
        else {
            temporaryNumber = number;
            while (temporaryNumber > 0) {
                remainder = temporaryNumber % 10;
                remainder = (remainder * remainder * remainder);
                sumOfDigits += remainder;
                temporaryNumber = temporaryNumber / 10;
            }
            if (sumOfDigits != number)
                System.out.println("Not Armstrong number");
            else
                System.out.println("Armstrong number");
        }
    }
}
