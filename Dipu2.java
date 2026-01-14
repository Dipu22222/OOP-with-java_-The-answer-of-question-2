import java.util.Scanner;

public class Dipu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program is designed to exhibit the positive divisors of");
        System.out.println("positive integers supplied by you. The program will repeatedly");
        System.out.println("prompt you to enter a positive integer. Each time you enter a");
        System.out.println("positive integer, the program will print all the divisors of your");
        System.out.println("integer in a column and in decreasing order.");
        System.out.println();

        while (true) {
            int n;
            while (true) {
                System.out.print("Please enter a positive integer: ");
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println(n + " is not a positive integer.");
            }

            for (int i = n; i >= 1; i--) {
                if (n % i == 0) System.out.println(i);
            }

            while (true) {
                System.out.print("\nWould you like to see the divisors of another integer (Y/N)? ");
                String s = sc.next();
                if (s.equalsIgnoreCase("y")) break;
                if (s.equalsIgnoreCase("n")) return;
                System.out.println("\nPlease respond with Y (or y) for yes and N (or n) for no.");
            }
        }
    }
}
