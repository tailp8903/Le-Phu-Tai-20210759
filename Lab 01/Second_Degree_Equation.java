import java.util.Scanner;;
public class Second_Degree_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter parameters of equation ax^2 + bx + c = 0:");
        do {
            System.out.print("a = ");
            a = sc.nextDouble();
        }while(a == 0);
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) System.out.println("The equation has no root!");
        else if (delta == 0) System.out.println("The equation has double root: x = " + -b / (2 * a));
        else{
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 distinct root: x1 = " + x1 + ", x2 = " + x2);
        }
        sc.close();
    }
}
