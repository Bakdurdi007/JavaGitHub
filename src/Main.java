import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter a: ");
        int a = scanner.nextInt();

        System.out.print(" Enter b: ");
        int b = scanner.nextInt();

        System.out.println(" S = a + b = " + (a + b));
        System.out.println(" S = a - b = " + (a - b));
        System.out.println(" S = a * b = " + (a * b));
        System.out.println(" S = a / b = " + (a / b));

        System.out.println(" Hellooooooooooooooooooo");
    }
}