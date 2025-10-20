//Program to find the sum of its digits of a number
import  java.util.Scanner;
public  class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,remainder,sum=0;
        System.out.println("Enter the number: ");
        number=sc.nextInt();
       while(number>0){
           remainder=number%10;
           sum+=remainder;
           number=number/10;
       }
        System.out.println("The sum of digits: "+sum);
    }
}
