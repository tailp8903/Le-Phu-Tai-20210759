import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b of equation ax + b = 0: ");
        double a, b;
        do {
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();
        }while(a == 0);
        double ans = -b / a;
        System.out.printf("The root of the equation: x = %.2f", ans);
        sc.close();
    }
}
