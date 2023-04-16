import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = sc.next();
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        System.out.print("How tall are you(m)? ");
        double height = sc.nextDouble();
        System.out.println("Mrs/Ms. " + name + ", " + age + " year old. Your height is " + height + ".");
        sc.close();    
    }
}
