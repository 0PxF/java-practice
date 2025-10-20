//Program to display all the possible combinations of consecutive natural numbers which are added to give the sum equal to the original number
//Eg: 15, combinations: (1,2,3,4,5),(4,5,6),(7,8)
import  java.util.Scanner;
public  class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int number,sum;
        System.out.println("Enter number:");
        number = sc.nextInt();
        for(int i=1;i<number;i++){
            for(int j=i;j<=number;j++){
                sum=0;
                for(int k=i;k<=j;k++)
                    sum+=k;
                if(sum==number){
                    for(int l=i;l<=j;l++)
                     System.out.print(l+" ");
                    System.out.println();
                }
            }
        }
    }
}
