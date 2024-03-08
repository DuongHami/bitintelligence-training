import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randNum = rand.nextInt(101);

        System.out.println("Try to guess the number between 0 - 100");
        int num = scanner.nextInt();

        int passes = 1;

        while(randNum != num){
            passes++;
            if(randNum < num){
                System.out.println("Your guess is to high");
            }else{
                System.out.println("Your guess is to low");
            }
            System.out.println("Try to guess again:");
            num = scanner.nextInt();
        }

        System.out.println("The number was "+ randNum +". You correctly guessed the number in "+ passes +" tries");

        scanner.close();
    }
}
