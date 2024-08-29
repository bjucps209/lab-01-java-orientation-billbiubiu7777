import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNum = rand.nextInt(11);
        int numGuesses = 1;
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.println("Please enter a number 1-11: ");
            guess = sc.nextInt();
            if(guess > secretNum){
                System.out.println("The number you entered is greater than the secretNum.");
                numGuesses++;
            }
            else if(guess < secretNum){
                System.out.println("The number you entered is smaller than the secretNum.");
                numGuesses++;
            }
            else {
                System.out.println("You got the number!");                
                break;
                
            }
            
        }
        sc.close();
        System.out.println("It took you " + numGuesses + " guesses to get the right number.");
    }


    
    




    
    


}
