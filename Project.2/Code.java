import java.util.*;
import java.io.*;
class Solution{

    public static void main(String []argh)
    {
//        Program to find sum and average of an array(float)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Floats you want to add: ");
        int x = sc.nextInt();
        float [] arr=new float[x];
        int i,j;
        System.out.println("Start entering the values: ");
        for(i=0;i<x;i++){
            arr[i] = sc.nextFloat();
        }
        float sum=0;
        for(i=0; i<x; i++){
            sum=sum+arr[i];
        }
        float avg=sum/x;
        System.out.printf("Total sum of the numbers is: %.2f\n",sum);
        System.out.printf("Average of the numbers is: %.2f",avg);
//        Program to traverse the array for a user given number
        System.out.println("\nEnter a number to find in the array and its index if present: ");
        int count=0,y= sc.nextInt();
        for(i=0; i<x; i++){
            if(y==(int)arr[i]){
                System.out.printf("Found the number at index: %d\n",i);
                count++;
            }

        }
        if(count==0){
            System.out.println("The entered number is not found in the array");
        }

//        Program to reverse an array
        float temp;
        for(i=0; i<(x/2); i++){
            temp=arr[i];
            arr[i]=arr[(x-i-1)];
            arr[x-i-1]=temp;
        }
        for(i=0; i<x; i++){
            System.out.println(arr[i]);
        }
//        Program to find maximum and minimum in a array
        float max=arr[0],min=arr[0];
        for(i=0;i<x;i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            else{
            }
        }
        System.out.printf("Maximum no. is: %.2f and minimum no. is: %.2f",max,min);
//        Program to find if array is sorted
        int acount=0;
        int dcount=0;
        for(i=0;i<(x-1);i++){
            j=i+1;
            if(arr[i]>arr[j]){
                acount++;
                break;
            }
        }
        for(i=0;i<(x-1);i++){
            j=i+1;
            if(arr[i]<arr[j]){
                dcount++;
                break;
            }
        }
        if(acount==0){
            System.out.println("\nArray is ascending sorted");
        }
        else if(dcount==0){
            System.out.println("\nArray is descending sorted");
        }
        else{
            System.out.println("\nArray is not sorted");
        }
    }
}
