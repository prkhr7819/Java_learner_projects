import java.util.*;
import java.io.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to find the sum of the multiplication table: ");
        int num = sc.nextInt(),count=0;
        System.out.println("Enter how many occurrences you want in the multiplication table: ");
        int mul = sc.nextInt();
        System.out.printf("Multiplication table of %d upto %d is as follows: \n",num,mul);
        for(int i=1;i<=mul;i++){
            System.out.printf("%d time %d is %d\n",num,i,(num*i));
            count=count+(num*i);
        }
        System.out.printf("Sum of the multiplication table is: %d",count);


    }
}
