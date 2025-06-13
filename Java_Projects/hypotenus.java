import java.util.Scanner;

public class hypotenus{
    public static void main(String[] args) {
        // HYPOTENUS 
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the Lenght of A: ");
        a = input.nextDouble();

        System.out.print("Enter the Lenght of B: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenus (side c) is : "+c+"cm");

        input.close();
    }
}
