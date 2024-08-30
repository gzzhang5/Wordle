import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    int attempts = 6;
    //choose gamemode
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to Wordle");
    System.out.println("letter: letter is correctly placed");
    System.out.println("*: letter is correct but misplaced");
    System.out.println("-: letter is not in the word");
    System.out.println("Choose a gamemode: enter 4, 5, 6, or 7 for that amount of letters");
    
    boolean gamestate=true;
    while(gamestate){
    
    int gamemode = console.nextInt();

    String word="";
    if(gamemode ==4){
      String[] wordBank4={"dumb", "cold", "baby"};
      word = wordBank4[(int)(Math.random()*3)];
    }
    else if(gamemode==5){
      String[] wordBank5={"happy", "tired", "yummy"};
      word = wordBank5[(int)(Math.random()*3)];
    }
    else if(gamemode==6){
      String[] wordBank6={"school", "flower", "escape"};
      word = wordBank6[(int)(Math.random()*3)];
    }
    else if(gamemode==7){
      String[] wordBank7={"pikachu", "napping", "physics"};
      word = wordBank7[(int)(Math.random()*3)];
    }
      
      System.out.println("You have 6 attempts\nGuess the word:");
      String guess = "";
      while(gamestate==true && attempts>0){
        guess = console.next();
        if(guess.length()!=gamemode){
          System.out.println("Must be " + gamemode + " letters");
        }
        else{
        for(int i=0; i<word.length(); i++){
          boolean didBreak=false;
          for(int j=0; j<word.length(); j++){
            if(guess.charAt(i)==word.charAt(i)){
              System.out.print(guess.charAt(i));
              didBreak=true;
              break;
            }
            if(guess.charAt(i)==word.charAt(j)){
              System.out.print("*");
              didBreak=true;
              break;
            }
          }
          if(!didBreak){
            System.out.print("-");
          }
        }
        attempts--;
        }
      if(guess.equals(word)){
        System.out.println("\nYou guessed right!");
        System.out.print("Would you like to play again?");
      String replay = console.next();
      if (replay.equalsIgnoreCase("No")){
        gamestate = false;
      }
      else if(replay.equalsIgnoreCase("Yes")){
        gamestate=true;
      }
        
      }
        else if(attempts==0){
          System.out.println("\nYou ran out of attempts. The word was: " + word);
          System.out.print("Would you like to play again?");
      String replay = console.next();
      if (replay.equalsIgnoreCase("No")){
        gamestate = false;
      }
      else if(replay.equalsIgnoreCase("Yes")){
        gamestate=true;
      }
    
      }
     
    }
  }

   
  }
}