package work_sheet;
public class Two {

    static String name="Firomsa";

   void greeting(String name){

        System.out.print("Hello "+name);
    }

    public static void main(String args []){

        Two tow = new Two();

        tow.greeting(name);
        
    }
    
}
