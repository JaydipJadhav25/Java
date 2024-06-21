interface Collage{
   int x =10;
      void demo();
}
interface Collage2{
    int x =10;
       void demo2();
 }
class Student{
    int y = 10;
    public void greet(){
        System.out.println("good moring");
    }

}
class Info extends Student implements Collage, Collage2{
    @Override
    public void demo(){
        System.out.println("hello world");
    }
    public void demo2(){
        System.out.println("hello world");
    }
}

public class interfaceclass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Info i = new Info();
        i.demo();
        // Collage c =new Collage();
        Collage c =new Info();  //ref geu shakto pn object ni create kru shakth
        
        System.out.println(c.x);
        
    }
}
