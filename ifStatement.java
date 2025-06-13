import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        // If statement = perform a block of code if its condition is true

        Scanner input = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("How old are you: ");
        age = input.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = input.nextBoolean();

        // Group One
        if(name.isEmpty()){
            System.out.println("You did not enter your name😒🥵");
        }
        else{
            System.out.println("Hello "+name+"!😊") ;
        }


        

        // Group Two
        if(age>=18){
            System.out.println("You are matured");
        }
        else if (age < 0 || age == 0) {
            System.out.println("You have not being born yet");
        }
        else{
            System.out.println("\n You are a child");
        }

        // Group Three
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        input.close();
    }

}
