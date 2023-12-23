import java.util.*;
import java.io.*;
class Solution{
    public static void element(int num[]){
        int n = num.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }
            else{
                map.put(num[i], 1);
            }
        }
        System.out.println("Element which has frequency more than N/3 are ");
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String []argh)
    {
        int num[]={1,3,2,5,1,3,1,5,1,5,5};
        element(num);
    }
}
