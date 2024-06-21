public class expectionhandling {

    public static void demo(){

    }
    public static void main(String[] args) {
        int a, b;
        a= 10 ;
        b = 10;
        try {

        int result = a/b;


        throw new ArithmeticException();

 
            
        
       

        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("error");
        }


        if (a<b) {
            
        }
        
        System.out.println("end of code ");
    }
}
