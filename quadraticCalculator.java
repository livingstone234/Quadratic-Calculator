import java.util.Scanner;

public class boss {

    public static void main(String[] args) {
       Scanner bhim = new Scanner(System.in);

       float a, b, c, discriminant, x1, x2;
       System.out.println("Enter your a, b, and c: ");

       a = bhim.nextFloat();
       b = bhim.nextFloat();
       c = bhim.nextFloat();

       discriminant = (float) (Math.pow(b, 2) - (4*a*c));

       if(discriminant > 0){
           System.out.println("The roots are real and different");
           x1 = (float)((-b + Math.sqrt(discriminant))/(2*a));
           x2 = (float)((-b - Math.sqrt(discriminant))/(2*a));

           System.out.println("x1 = "+x1);
           System.out.println("x2 = "+x2);

       }
       else if(discriminant == 0){
           System.out.println("The roots are real and the same. So x1 = x2");
           x1 = -b/(2*a);
           System.out.println("x1 = x2 = "+x1);

       }
       else{
           System.out.println("The roots are complex and different.");
           float real;
           real = -b/(2*a);
           x1 = (float) (Math.sqrt(-discriminant)/(2*a));
           x2 = (float) (Math.sqrt(-discriminant)/(2*a));

           System.out.println("x1 = "+real+" + "+x1+"i");
           System.out.println("x2 = "+real+" - "+x2+"i");
       }
