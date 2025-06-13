import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        // working with Random numbers in Java

        Random random = new Random();
        
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,101);
        number2 = random.nextInt(1,101);
        number3 = random.nextInt(1,101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //BOOLEAN
        boolean isHead;
        isHead = random.nextBoolean();

        if (isHead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }    
    }

}
