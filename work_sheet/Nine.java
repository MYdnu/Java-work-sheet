package work_sheet;
public class Nine {
    
    double sum (double a,int b){
        double sum = a+b;

        return sum;
    }

    double sum1 (double a,double b){
        double sum1 = a+b;

        return sum1;
    }

    double sum2 (int a,double b){
        double sum2 = a+b;

        return sum2;
    }

    double sum3 (double a,double b,double c){
        double sum3 = a+b+c;

        return sum3;
    }

    public static void main(String args []){
        Nine nine = new Nine();
     

        System.out.println("Resualt is "+ nine.sum(5.5, 6));
        System.out.println("Resualt is "+ nine.sum1(3.3, 9.8));
        System.out.println("Resualt is "+ nine.sum2(6, 23.9));
        System.out.println("Resualt is "+ nine.sum3(8.5, 8.9,9.8));



    }
}
