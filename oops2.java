class Base{

    Base(){
      System.out.println("i am constructor of base class");

    }
};

class Drived extends Base{
    Drived(){
      System.out.println("i am constructor of drived class");

    }
};

public class oops2 {
    public static void main(String[] args) {

        Drived d = new Drived();
        
    }
}
