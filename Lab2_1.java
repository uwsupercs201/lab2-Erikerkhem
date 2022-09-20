import java.util.Scanner;

public class Lab2_1 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        //Prompting
        System.out.print("Enter the x-coordinate of point 1: ");
                double point1x = input.nextDouble();
        System.out.print("Enter the y-coordinate of point 1: ");
                double point1y = input.nextDouble();
        System.out.print("Enter the z-coordinate of point 1: ");
                double point1z = input.nextDouble ();
        System.out.print("Enter the x-coordinate of point 2: ");
                double point2x = input.nextDouble();
        System.out.print("Enter the y-coordinate of point 2: ");
                double point2y = input.nextDouble();
        System.out.print("Enter the z-coordinate of point 2: ");
                double point2z = input.nextDouble();


        //Calculation

        double distance = (Math.sqrt((point1x-point2x)*(point1x-point2x)+(point1y-point2y)*(point1y-point2y)+(point1z-point2z)*(point1z-point2z)));



        //Printing
        System.out.print("The distance between point 1 and point 2 is: " + distance);
    }
}
