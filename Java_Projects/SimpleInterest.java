import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        // SIMPLE INTEREST
        /*  An investment policy, interest of 5% is added every month,
            HERE IS THE CODE
        */
        Scanner input = new Scanner(System.in);
        double totalAmount;
        double monthRate;
        double principal;
        int months;
        double Interest;


        System.out.print("Enter the amount you want to invest: ");
        principal = input.nextDouble();

        System.out.print("Enter the time (in month): ");
        months = input.nextInt();

        System.out.print("Enter the rate: ");
        monthRate = input.nextDouble()/100;

        Interest = principal * months * monthRate;
        totalAmount = Interest + principal;

        System.out.printf("The Principal is %,.2f\n",principal);
        System.out.printf("The Rate is %,.0f\n",monthRate*100);
        System.out.printf("The Duration in month is %d\n",months);
        System.out.printf("The Interest is %,.2f\n",Interest);
        System.out.printf("The Total Amount is %,.2f",totalAmount);
        

    }
}