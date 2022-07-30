import java.util.Scanner;

public class javaloop {
        public static void main(String args []){

        Scanner in = new Scanner(System.in);
        int n,num,sum = 0;
        System.out.print("How many nubers do you want to add");
        n = in.nextInt();
        for(int i = 1; i <= n;i++ ){
            num = in.nextInt();

            sum = sum + num;
        }
        System.out.print(sum);
    }
    
}
