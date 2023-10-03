import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
class Solution{

    public static void main(String []argh)
    {
//        covert any string to lowercase
        String name="PRAKHAR SHARMA";
        String name_lower=(name.toLowerCase());
        System.out.println(name_lower);
//        convert all spaces with underscore
        String name_underscore=(name.replace(" ","_"));
        System.out.println(name_underscore);
////        replace <name> with name variable
        String neu="<name> is OP";
        String name_name=(neu.replace("<name>",name));
        System.out.println(name_name);
//        find if any double and triple spaces are present. if present then print its index and convert into single space
        String xyz="My name is  prakhar sharma and   i am a student";
        int Dspaces=(xyz.indexOf("  "));
        int Tspaces=(xyz.indexOf("   "));
        System.out.printf("Index of double spaces is: %d\n",Dspaces);
        System.out.printf("Index of triple spaces is: %d\n",Tspaces);
//        String neu_xyz="";
        if(Dspaces!=-1){
            xyz=(xyz.replace("  "," "));
        }
        if(Tspaces!=-1){
            xyz=(xyz.replace("  "," "));
        }
        System.out.printf("New string is: '%s'",xyz);

    }
}
