import java.util.Scanner;
public class KGV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me one number:");
        int a = scanner.nextInt();

        System.out.println("Give me a second number:");
        int b = scanner.nextInt();

        int kgv = getSmallestCommonProduct(a, b);
        System.out.println("The smallest common multiple of "+a+ " and "+b+" is: "+ kgv);


    }

    public static int getSmallestCommonProduct(int a, int b){
        int numerator = Math.abs(a*b);
        int denominator = getBiggestCommonDivider(a, b);
        return numerator/denominator;
    }

    public static int getBiggestCommonDivider(int a, int b){
        if(a == b){
            return a;
        } else if(a == 0 || b == 0){
            return Math.max(a, b);
        }

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int kgv = max%min;

        if(kgv == 0){
            return min;
        }

        while(max%min != 0){
            kgv = max%min;
            max = min;
            min = kgv;
        }
        return kgv;

    }
}
