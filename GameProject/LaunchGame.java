package GameProject;

import java.util.Scanner;

class Guesser{
    int guessNum;
    int guessingNum(){
        System.out.println("Guesser! Kindly guess the number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player{
    int pguessNum;
    int pguessingNum(){
        System.out.println("Player!  Kindly guess the number");
        Scanner sc = new Scanner(System.in);
        pguessNum = sc.nextInt();
        return pguessNum;
    }
}

class Umpire{
    int noFromGuesser;
    int noFromPlayer1;
    int noFromPlayer2;
    int noFromPlayer3;
    void collectNoFromGuesser(){
        Guesser g = new Guesser();
        noFromGuesser = g.guessingNum();
    }
    void collectNoFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        noFromPlayer1 = p1.pguessingNum();
        noFromPlayer2 = p2.pguessingNum();
        noFromPlayer3 = p3.pguessingNum();
    }
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
        Umpire u = new Umpire();
        u.collectNoFromGuesser();
        u.collectNoFromPlayers();
        u.compare();
    }
}
