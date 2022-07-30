package work_sheet;

public class One{
    int a=8 ,b =5;

   public One(){ 

        System.out.println("Resualt of "+a+" + "+b+" = "+add(a, b));
        System.out.println("Resualt is:"+a+" - "+b+" = "+minus(a, b));
        System.out.println("Resualt is:"+a+" / "+b+" = "+div(a, b));
        System.out.println("Resualt is:"+a+" mod "+b+" = "+mod(a, b));
        System.out.println("Resualt is:"+a+" * "+b+" = "+multi(a, b));

    
   }

public int add(int a,int b){

    return Math.addExact(a, b);
}

public int minus(int a, int b){

    return Math.subtractExact(a, b);
}

public int div(int a,int b){
    
    return Math.divideExact(a, b);
}

public int multi(int a, int b){

    
    return Math.multiplyExact(a, b);
}

public int mod(int a, int b){

    return Math.ceilMod(a, b);
}
    


public static void main(String args []){

    new One();
}

}