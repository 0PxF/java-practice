//Program to display square and cube for first n natural numbers
import  java.util.Scanner;
public  class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n=sc.nextInt();
        System.out.println("The square  and cubes of natural numbers are:");
        for(int i=1;i<=n;i++)
            System.out.println("Square:"+(i*i)+" Cube:"+(i*i*i));
    }
}
