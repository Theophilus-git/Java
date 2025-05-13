import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args){

        // SHOPPING CART PROGRAM

        Scanner input = new Scanner(System.in);

        String item;
        double price;
        char currency = '$';
        int quantity;
        double total;

        System.out.print("What item will you buy?: ");
        item = input.nextLine();

        System.out.print("What is the price for each: ");
        price = input.nextDouble();

        System.out.print("How many would you like: ");
        quantity = input.nextInt();

        total = price * quantity;

        System.out.println("\n You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency + total);
        

        //System.out.println(item);
        


        input.close();
    }
}