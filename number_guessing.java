import java.util.*;
import java.io.*;
class Solution{
    static int count=1;
    public static void guess(int rand){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(num==rand){
            System.out.println("You found the number.");
            System.out.print("The random number was ");
            System.out.println(rand);
            return;
        }
        else if (num<0) {
            return;
        }
        else if (num<rand) {
            System.out.println("The desired number is greater than this.");
        }
        else if (num>rand) {
            System.out.println("The desired number is smaller than this.");
        }
        count++;
        guess(rand);
    }
    public static void main(String []argh)
    {

        System.out.println("--------- This is random value guesser --------\nRule-1) computer will take a value and user has to guess what the value is:");
        System.out.println("Rule-2) Computer will tell if your number is smaller or greater than te computer generated number,");
        System.out.println("Rule-3) Enter -1 to exit and find out what the number is.\n");
        int rand=(int)(Math.random()*100);
        guess(rand);
        System.out.printf("You took %d tries to guess the answer: \n",count);
    }
}
