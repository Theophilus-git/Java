import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        /* Circumference of a circle = 2 * math.pi * radius
           Area of a circle = math.pi * math.pow(radius,2)
           Volume = (4.0 / 3.0) * math.pi * math.pow(radius,3)
        */

       Scanner input = new Scanner(System.in);

       double radius;
       double area;
       double volume;
       double circumference;

       System.out.print("Enter the radius of the Circle: ");
       radius = input.nextDouble();

       circumference = Math.PI * 2 * radius;
       area = Math.PI * Math.pow(radius, 2);
       volume = Math.PI * Math.pow(radius, 3) * (4.0 / 3.0);

       System.out.printf("The Area of the Circle is %.2fcm\n",area);
       System.out.printf("The Circumference is : %.2fcm²\n",circumference);
       System.out.printf("The volume of the Circle is : %.2f\n",volume);

       input.close();

    }
}