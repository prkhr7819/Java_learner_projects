import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num=number;
        int count=0;
        while (number > 0){
            count=count+(number % 10);
            number = number/10;
            count=count*10;
        }
        count=count/10;
        System.out.printf("%d is the reverse of the above number\n",count);
        if(count==num){
            System.out.println("yes it is a pallindrome");
        }
        else{
            System.out.println("no it is not a pallindrome");
        }
    }
}
