/**
 * abstractclass
 */
 abstract class paraent{

    void  demo(){
  System.out.println("this is not A ABSTRACT METHODES ");
    }

    abstract public void greet();

}


abstract class paraent2 extends paraent{

    void  demo(){
  System.out.println("this is not A ABSTRACT METHODES ");
    }

    abstract public void greet2();

}


class Child extends paraent2{


    public void greet(){

        System.out.println("this is abstraction methode");


    }
  public void greet2(){
        System.out.println("this is abstraction methode 2");

    }
}
public class abstractclass {
    public static void main(String[] args) {
        System.out.println("this is abstraction.............");
        Child c = new Child();
        c.greet();
        c.greet2();
        // paraent p = new paraent() ; not create object 
        // paraent p = new Child() ; allowoed give referces of parent class 
    }

    
}