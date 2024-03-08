import java.util.Scanner;

enum category {
    UNTERGEWICHT,
    NORMALGEWICHT,
    ÜBERGEWICHT,
    SCHWERES_ÜBERGEWICHT

}
public class BMICalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall are you (in cm)?");
        int height = scanner.nextInt();

        System.out.println("How much do you weight (in kg)?");
        int weight = scanner.nextInt();

        double bmi = calculateBMI(height, weight);

        category result = interpretBMI(bmi);

        System.out.println("Your BMI is in the category: " + result);

        scanner.close();
    }

    public static double calculateBMI(int height, int weight){
        double height_in_m = height/100.0;
        return (double)weight / (height_in_m * height_in_m);
    }

    public static category interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return category.UNTERGEWICHT;
        } else if (bmi >= 18.5 && bmi < 25) {
            return category.NORMALGEWICHT;
        } else if (bmi >= 25 && bmi < 30) {
            return category.ÜBERGEWICHT;
        } else {
            return category.SCHWERES_ÜBERGEWICHT;
        }
    }
}
