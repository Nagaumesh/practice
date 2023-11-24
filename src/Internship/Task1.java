package Internship;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        boolean playagain=true;
        while(playagain==true){
                
        Random random =new Random();
        Scanner sc=new Scanner(System.in);
        int random_num=random.nextInt(101);
        System.out.println("\"--------welcome to find the Number-Game--------------\"");
        System.out.print("Enter your guess: ");
        int guess=sc.nextInt();
        int score=10;
        boolean ans=true;
        while(guess!=random_num){
            if(random_num>guess){
                System.out.print("Too low try again :");
            }else{
                System.out.print("Too High try again :");
            }
            guess=sc.nextInt();
            score--;
            if(score==1){
                ans=false;
                break;
            }
        }
        if(ans==true){
            System.out.println("Congratulation you guessed the number in "+(11-score)+" attempts");
            System.out.println("your score is :"+(score-1)+"/10");
        }else{
            System.out.println("Maximum amount of tries reached score : 0");
        }
        System.out.println("Do you want to play again ?? ");
        System.out.print("if yes type true or type false : ");
        playagain=sc.nextBoolean();
        }
        
        

        
    }
    
}
