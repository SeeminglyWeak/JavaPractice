
import java.util.Random;
import java.util.Scanner;

class Game{
    int n;
    int randomInt;
    Scanner sc = new Scanner(System.in);
    public Game(){
        Random rand = new Random();
        randomInt = rand.nextInt(101);
        System.out.println(randomInt);
    }
    void takeUserInput(){
        System.out.println("Enter a number between 1 to 100");
        n = sc.nextInt();
    }
    void getAttempts(int a){
        System.out.println("You guessed the number in " + a + " Attempts");
    }
    boolean isCorrectNumber() {
        if (n == randomInt) {
            System.out.println("Hooray!!! You guessed the number correctly.");
            return true;
        } else if (n < randomInt) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game guess = new Game();
        int attempts = 0;
        boolean correct = false;
        while (!correct) {
            guess.takeUserInput();
            correct = guess.isCorrectNumber();
            attempts++;
        }
        guess.getAttempts(attempts);
    }
}