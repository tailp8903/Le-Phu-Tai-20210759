import java.util.Scanner;;
public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a11, a12, a21, a22, b1, b2;
        System.out.println("Enter the parameter of a11*x1 + a12*x2 = b1:");
        a11 = sc.nextDouble(); a12 = sc.nextDouble(); b1 = sc.nextDouble();
        System.out.println("Enter the parameter of a21*x1 + a22*x2 = b2:");
        a21 = sc.nextDouble(); a22 = sc.nextDouble(); b2 = sc.nextDouble();
        double D = a11 * a22 - a21 * a12;
        double D1 = a22 * b1 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D == 0) System.out.println("The equation system has no root!");
        else System.out.println("The root of the linear system: x1 = " + D1 / D + ", x2 = " + D2 / D);
        sc.close();
    }
}
