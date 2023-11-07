//Level Easy
import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Level Medium
import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.print("\n");
        }
    }
}
//Level Hard
import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=0;j<num;j++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i=0;i<num;i++){
            if(i<num-1){
                System.out.print("*");
            }
            for(int j=num-1;j>i+2;j--){
                System.out.print("-");
            }
            if(i<num-2){
                System.out.print("*");
                System.out.print("\n");
            }
        }
    }
}
