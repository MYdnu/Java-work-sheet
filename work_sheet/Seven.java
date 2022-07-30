package work_sheet;
import java.util.Scanner;

public class Seven {

    static double poundToKilo(int pound){
        double kilo;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of pound : ");
        pound = in.nextInt();
        kilo = pound*0.454;

        return kilo;
    }

    public static void main(String args []){
        int pound = 0;

        Seven seven = new Seven();

        System.out.print("Resualt is "+poundToKilo(pound)+" kg");
    }
    
}
