import java.util.*;
import java.io.*;
class Solution{
    public static void element(int num1[],int num2[]){
        int n1 = num1.length,n2=num2.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<n2;i++){
            set.add(num2[i]);
        }
        for(int i=0;i<n1;i++){
            set.add(num1[i]);
        }
        System.out.println("Size of the union array will be: ");
        System.out.println(set.size());
        System.out.println("elements of the union array will be: ");
        System.out.println(set);

    }
    public static void main(String []argh)
    {
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
        element(num1,num2);
    }
}
