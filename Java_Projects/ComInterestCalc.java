import java.util.Scanner;

public class ComInterestCalc{
    public static void main(String[] args) {
        // COMPOUND INTEREST CALCULATOR

        Scanner input = new Scanner(System.in);

        double A;/* A = Final Amount*/
        double P;/* P = Principal*/
        double r;/* r = interest rate*/
        int n;/* n = Number of times interest applied per time period*/
        double t;/* t = number of time periods elapsed*/

        System.out.print("Enter the amount you want to invest: ");
        P = input.nextDouble();

        System.out.print("Enter nunber of times interest is compounded per year: ");
        n = input.nextInt();

        System.out.print("Please enter the rate for the investment: ");
        r = input.nextDouble()/100;

        System.out.println("The duration you are investing (in months): ");
        t = input.nextInt()/12.0; // Convert month to years
 
        A = P * Math.pow(1 + r / n, n*t);

        System.out.printf("Principal is %.2f\n", P);
        System.out.printf("Interest rate is %.2f\n", r*100);
        System.out.printf("This interest will last %.2f\n",t);
        System.out.println("Interest is compounded "+n+" times per year. ");
        System.out.printf("The final amount the investor will earn is %.2f",A);



        input.close();
    }

}