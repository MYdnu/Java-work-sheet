package work_sheet;
import java.util.Scanner;

public class Five {
    void multiplyNumber(int num){
        int sum = 1;
       /* 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        */
        for (int i = 1; i <= 10; i++){

            sum = num *i;

            System.out.println(num+" * "+i+" = "+sum);
        }
    }

    public static void main(String args []){
        Five multinum = new Five();

        multinum.multiplyNumber(5);
    }
    
}
