import java.util.Scanner;
public class numberGuessingGameTask2 {
  public static void main(String[] args) {
    System.out.println("\n\n                 *******************  WELCOME TO GUESS THE GAME  ******************************                   \n\n");

     /*Use Math.random Fuction to generate random number.
     * Math.random genarate float number greater than or equal to 0.0 and less than 1.0. 
     * use (int) for casting and + 1 for not generate 0.*/ 

     int randomNumber = (int) (Math.random()*100) + 1;
     boolean won = false;
     
     System.out.println("Choose a random Number Between 1 to 100");  

     Scanner sc = new Scanner(System.in);
     
     // Use a loop for attempts
     for(int i = 10 ; i > 0 ; i--)
     {
         System.out.println("You have " + i + " guess(es).");
            int userInputNum = sc.nextInt(); // Take imput from the User 

           if(randomNumber < userInputNum ) {
               System.out.println("Its smaller then " + userInputNum + " Guess Again! ");
            } 
          else if(randomNumber > userInputNum)  {
               System.err.println("Its greater then " + userInputNum + " Guess Again! ");
            } 
           else{
             won = true;
             break;
            } 
        }
          if(won){
            System.out.println("You Guess CORRECT..... You WIN :) ");
          }
          else{
            System.out.print("     ******** GAME OVER..... YOU LOOSE!! BETTER LUCK NET TIME ********    ");
            System.out.println(" The Number was " + randomNumber);
          }
   }   
}
