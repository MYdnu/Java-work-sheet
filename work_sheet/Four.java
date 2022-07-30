package work_sheet;
import java.util.Scanner;

public class Four {

    static boolean isOdd(int num){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = in.nextInt();

        if (num%2 != 0){
            boolean val = true;
            return val;
        }
        else
        return false;
    }
    
    public static void main(String args []){
        int num=0;

        System.out.println(isOdd(num));
         }
    
}
