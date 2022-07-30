import java.util.Scanner;

public class calcu{
   private int num1;
   private  int num2;
   private int n,num,sum;
   private double a,b;

    /**
     * 
     */
    public calcu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your oprater");

    System.out.println("1. Addition"); 
    System.out.println("2. Subtraction");
    System.out.println("3. Division");
    System.out.println("4. Multiplication");
    System.out.println("5. Square ");
    System.out.println("6. Cube");
        
    int choice ;
    choice =in.nextInt();
    switch (choice){
        case 1 :
        System.out.println("Resualt is: " + add(n, num, sum));

           break;
        case 2:
        System.out.println("Resualt is: "+ sub(num1, num2));

           break;
        case 3:
        System.out.println("Resualt is: "+ dev(num1, num2));
   
            break;
        case 4:
        System.out.println("Resualt is: " + mul(n, num, sum));

           break;
        case 5:
        System.out.println("Resualt is: " + Squar());
   
           break;
        case 6:
        System.out.println("Resualt is: " + PWO());
      
              break;

        
    } 
}

public int add(int n, int num , int sum) {
    Scanner in = new Scanner(System.in);
    sum = 0;
        System.out.print("How many nubers do you want to add");
        n = in.nextInt();
        for(int i = 1; i <= n;i++ ){
            num = in.nextInt();

            sum = sum + num;
        }
        return sum;

}

public int mul(int n, int num , int sum) {
    Scanner in = new Scanner(System.in);
    sum = 1;
        System.out.print("How many nubers do you want to multiply");
        n = in.nextInt();
        for(int i = 1; i <= n;i++ ){
            num = in.nextInt();

            sum = sum * num;
        }
        return sum;

}

public int sub(int num1 , int num2){
    return num1 - num2;
}

public int dev(int num1, int num2){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter frist number: ");
    num1=in.nextInt();
    System.out.println("Enter frist number: ");
    num2=in.nextInt();
    
    if(num2 !=0){
        return num1 /num2;
    }
    else
    return 0;
}

public double Squar(){
    Scanner in = new Scanner(System.in);
    System.out.println("Square of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    
    return Math.sqrt(a);
}

public double PWO(){
    Scanner in = new Scanner(System.in);
    System.out.println("Exponent of a number");
    System.out.print("Enter base number: ");
    a = in.nextDouble();
    System.out.print("Enter Power of number: ");
    b = in.nextDouble();


    return Math.pow(a, b);
}
    public static void main(String args [])
    {
        new calcu();

    }
}
