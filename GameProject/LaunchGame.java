package GameProject;
import java.util.Scanner;

//Guesser Class----------->
class Guesser{
    int guessNum;

    //Method for guessing number by Guesser
    int guessingNum(){
        System.out.println("Guesser! Kindly guess the number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

//Player Class----------->
class Player{
    int guessNum;

    //Method for guessing number by Players
    int guessingNum(){
        System.out.println("Player!  Kindly guess the number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

//Umpire Class------------->
class Umpire{
    int noFromGuesser;
    int noFromPlayer1;
    int noFromPlayer2;
    int noFromPlayer3;

    //Method to collect number from Guesser
    void collectNoFromGuesser(){

        //Creating Guesser Object...
        Guesser g = new Guesser();
        noFromGuesser = g.guessingNum();
    }

    //Method to collect numbers from Players
    void collectNoFromPlayers(){

        //Creating Player's Objects...
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        noFromPlayer1 = p1.guessingNum();
        noFromPlayer2 = p2.guessingNum();
        noFromPlayer3 = p3.guessingNum();
    }

    //Method to compare the numbers between Guesser and Players
    void compare(){
        if(noFromGuesser==noFromPlayer1){
            if(noFromGuesser==noFromPlayer2 && noFromGuesser==noFromPlayer3){
                System.out.println("All Players won the game ");
            }else if(noFromGuesser==noFromPlayer2){
                System.out.println("Player1 and Player2 won the game");
            }else if(noFromGuesser==noFromPlayer3){
                System.out.println("Player1 and Player3 won the game");
            }else{
                System.out.println("Player1 won the game");
            }
            
        }else if(noFromGuesser==noFromPlayer2){
            if(noFromGuesser==noFromPlayer3){
                System.out.println("Player2 and Player3 won the game");
            }else{
                System.out.println("Player2 won the game");
            }
        }else if(noFromGuesser==noFromPlayer3){
            System.out.println("Player3 won the game");
        }else{
            System.out.println("Game lost !!! Try Again");
        }
    }
}


public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Started.......");

        //Creating Umpire Object...
        Umpire u = new Umpire();
        
        u.collectNoFromGuesser();
        u.collectNoFromPlayers();
        u.compare();
    }
}
