import java.util.Scanner;

public class commonIssues {
    public static void main(String[] args) {
        // Common Issues

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite : ");
        String color = scanner.nextLine();

        System.out.println("You are "+age+" years old");
        System.out.print("You like color "+color+" very much");

        scanner.close();
    }
}