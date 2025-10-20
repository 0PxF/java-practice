//Program to Evaluate the expression: (a^b*b^c)/(a*b*c) by taking a,b,c as inputs
//The program should terminate as soon as the user enters 'n' from the console.
import  java.util.Scanner;
public  class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c; double answer; char ch='y';
        System.out.println("Enter 'n' to terminate the program");
        do {
            System.out.println("Enter the values of a,b,c:");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            answer = (Math.pow(a,b)*Math.pow(b,c))/(a*b*c);
            System.out.println("Answer:"+answer);
            System.out.println("To Continue Enter 'y':");
            ch=sc.next().charAt(0);
        }while(ch=='y');
    }
}
