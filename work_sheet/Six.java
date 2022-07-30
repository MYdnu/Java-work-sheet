package work_sheet;
import java.util.Scanner;

public class Six {

    double feetToMeter(double feet){
        Scanner in = new Scanner(System.in);
    double meter;
        System.out.print("Enter feet value: ");
        feet = in.nextDouble();
        
        meter = feet/3.28;

        return meter;
    }
    
    public static void main(String args []){

        Six six = new Six();
        double feet = 0;

        System.out.print("Resualt is "+six.feetToMeter(feet)+" meter");
    }
}
