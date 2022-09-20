import java.util.Scanner;

public class Lab2_2 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        //prompting
        System.out.print("Enter a number of seconds: ");
        int givenSeconds = input.nextInt();


        //calculating
        int weeks, days, hours, minutes, seconds;
        weeks = givenSeconds/604800;
        days = (givenSeconds-weeks*604800)/86400;
        hours = (givenSeconds-weeks*604800-days*86400)/3600;
        minutes = (givenSeconds-weeks*604800-days*86400-hours*3600)/60;
        seconds = (givenSeconds-weeks*604800-days*86400-hours*3600-minutes*60);


        //printing
        //System.out.print(hours);
        System.out.print(givenSeconds + " seconds is " + weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes and " + seconds + "seconds");

    }

}
