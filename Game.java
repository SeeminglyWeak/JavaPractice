import java.util.Scanner;

class TommyVecetti{
    void controls(String input){
        if (input.equalsIgnoreCase("w")){
            System.out.println("Moved a step forward");
        } else if (input.equalsIgnoreCase("a")) {
            System.out.println("Moved a step left");
        } else if (input.equalsIgnoreCase("s")) {
            System.out.println("Moved step backward");
        } else if (input.equalsIgnoreCase("d")) {
            System.out.println("Moved a step right");
        } else if (input.equalsIgnoreCase("right click")) {
            System.out.println("Firing bullets");
        }else if (input.equalsIgnoreCase("left click")){
            System.out.println("Scoped in");
        }else {
            System.out.println("Enter a valid command");
        }
    }
}
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are Tommy Vecetti, lets rock!!!");
        System.out.println("Move using WASD keys, fire with right click, open scope with left click.\nHow many turns you want?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i<=n; i++){
            System.out.print("Enter a command : ");
            String command = sc.nextLine();
            TommyVecetti tv = new TommyVecetti();
            tv.controls(command);
        }
    }
}