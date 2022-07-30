package work_sheet;
public class Eight {
    int minus(int a, int b){

        return Math.subtractExact(a, b);
    }
    double minus(double a, double b){
        double resualt = a -b;

        return resualt;
    }

    public static void main(String args []){

        Eight eight = new Eight();
        System.out.println("Resualt is "+eight.minus(6, 4));
        System.out.print("Resualt is "+eight.minus(4.6, 3.92));
    }
    
}
