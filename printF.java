public class printF{
    public static void main(String[] args) {
        // PRINTF() is a method used to format an output

        /*String name = "Charis";
        char firstLetter = 'A';
        int age = 21;
        double height = 60.5;
        boolean isEmployed = true;
        
        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name start with a %c\n",firstLetter);
        System.out.printf("Your are %d years old\n",age);
        System.out.printf("Your are %f inches tall\n",height);
        System.out.printf("Employed: %b\n",isEmployed);

        System.out.printf("%s is %d years old",name,age);*/
        // PRECISION
        // SOME OUT PUT METHOD:
        /* + = output a plus
           , = comma grouping
           ( = negative numbers are enclosed in ()
           space = display a minus if negative,space if positive
        *//*

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("% ,.10f\n",price1);
        System.out.printf("% ,.1f\n",price2);
        System.out.printf("% ,.1f\n",price3);
        */
       /* 0 = Zero padding
          number = right justified paddding
          negative number = left justified padding
          [width]

        */
       
       int id1 = 1;
       int id2 = 23;
       int id3 = 456;
       int id4 = 7890;

       System.out.printf("%-4d\n",id1);
       System.out.printf("%-4d\n",id2);
       System.out.printf("%-4d\n",id3);
       System.out.printf("%-44d\n",id4);


        
    }
}