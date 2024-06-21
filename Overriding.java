class Demo{
    public void info(){
        System.out.println("i am demo function");
    }
}
class Demo2 extends Demo{
    // @Override
    // public void info(){
    //     System.out.println("i am demo2 function");
    // }
}

public class Overriding {
    public static void main(String[] args) {
        Demo2 d  =new Demo2();
        d.info();
    }
}
