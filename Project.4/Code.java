import java.util.*;
import java.io.*;
class Solution{

    public static void main(String []argh)
    {
        System.out.println("----------This is Rock, Paper, Scissor Game----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter 1 for ROCK, 2 for PAPER, 3 for SCISSOR : ");
        int user=sc.nextInt();
        int comp=(int)(Math.random()*100);
        if(user==1){
            if(comp<34){
                System.out.println("______Its a draw.______\nComputer also choose Rock");
            }
            else if(comp>66){
                System.out.println("______You Lost.______\nComputer choose Paper");
            }
            else{
                System.out.println("______You Won.______\nComputer choose Scissors");
            }
        }
        else if(user==3){
            if(comp<34){
                System.out.println("______You lost.______\nComputer choose Rock");
            }
            else if(comp>66){
                System.out.println("______You Won.______\nComputer choose Paper");
            }
            else{
                System.out.println("______Its a draw.______\nComputer also choose Scissors");
            }
        }
        else if(user==2){
            if(comp<34){
                System.out.println("______You Won.______\nComputer choose Rock");
            }
            else if(comp>66){
                System.out.println("______Its a draw.______\nComputer also choose Paper");
            }
            else{
                System.out.println("______You lost.______\nComputer choose Scissors");
            }
        }
        else{
            System.out.println("Enter valid input.");
        }
    }
}
