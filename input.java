import java.util.Scanner;

public class input{
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = ob.nextLine();

        System.out.print("How old are you : ");
        int age = ob.nextInt();

        System.out.print("What is gpa: ");
        double gpa = ob.nextDouble();

        System.out.print("Are you The richest Man in the world currently: ");
        boolean isRich = ob.nextBoolean();


        System.out.println("My name is "+ name);
        System.out.println("I am "+age+ " years old");
        System.out.println("My GPA is "+gpa);

        if(isRich){
            System.out.println(name + ", You are a billionarie");
        }
        //System.out.println("Rich "+ isRich);


        ob.close();
    }
} 