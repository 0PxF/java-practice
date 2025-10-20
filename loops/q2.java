//Program to check whether a given integer is even or odd.
//The program should terminate as soon as the user enters 0 from the console.
import  java.util.Scanner;
public  class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter 0 to terminate the program");
        do {
            System.out.println("Enter number:");
            n = sc.nextInt();
            if(n!=0) {
                if (n % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }
            else
                break;
        }while(n!=0);
    }
}
