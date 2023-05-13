import java.util.Scanner;;
public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.printf("The sum of two number: %f\n", (num1 + num2));
        System.out.printf("The difference of two number: %f\n", (num1 - num2));
        System.out.printf("The product of two number: %.2f\n", (num1 * num2));
        if (num2 == 0 || num1 == 0){
            System.out.println("Cannot divide 0!");
        }
        else System.out.printf("The quotient of two number: %.2f", num1 / num2);
        sc.close();
    }
}
