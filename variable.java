public class variable{
    public static void main(String[] args){
        // Interger (INT)
        int age;
        age = 25;
        int level = 200;
        int rank = 1;
        int year = 2025;


        System.out.println("I am "+age);
        System.out.println("I am in Level : "+level);
        System.out.println("rank in terms of riches: "+rank);

        // Double Variable (DOUBLE)
        double price = 199100;
        double gpa = 4.3;
        double temperature = 12.9;

        System.out.println("$ "+price);
        System.out.println("Current GPA : "+gpa);
        System.out.println("Temperature : "+temperature);

        // CHAR VARIABLE
        char grade = 'A';
        char symbols = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbols);
        System.out.println(currency);

        // Boolean Variable
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        //System.out.print(isStudent);

        /*if (isStudent ==true) {
           System.out.print("You are a student"); 
        }
        else{
            System.out.print("You are not a student");
        }*/

        // STRING VARIABLE
        String name = "Theophilus Ofori";
        String food = "Tea";
        String email = "theophilusofori@gmail.com";
        String car = "Gwagon";
        String color = "Blue";

        System.out.println(name);
        System.out.println(food);
        System.out.println(email);
        System.out.println("You are "+age+" years old");
        System.out.println("Your average letter grade: "+grade);
        System.out.println("Your choice of Car is a "+color +" "+ year+" "+ car);
        System.out.println("The price is "+currency+ " "+price);

        if(forSale){
            System.out.println("There is a "+ car+ " for sale");
        }
        else{
            System.out.println("There "+ car+ " is not  for sale");
        }



        double current_networth = 798579539.97;
        int current_age = 29;
        String my_name = "Theophilus Ofori";
        char myGrade = 'A';

        System.out.println("Current networth is "+current_networth);
        System.out.println("Current age is "+current_age);
        System.out.println("My name is "+my_name);
        System.out.println("My grade is "+myGrade);




    }
}