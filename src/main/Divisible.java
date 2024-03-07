import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number to check for parity?");
        int number = scanner.nextInt();

        boolean result = checkDivisibility(number);

        if(result){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        //System.out.println((result)?number + " is even":number + " is odd");

        scanner.close();
    }
    public static boolean checkDivisibility(int a){
        return (a % 2) == 0;
    }

}
