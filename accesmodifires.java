
import jaydipjadhav.jaydipgym;

import java.util.*;

class Student{
    public int num1 = 10;
  protected int num2 = 20;
     int num3 = 30;
    private int num4 = 40;
   


}

class subclass extends jaydipgym{
      public void printdata(){
        System.out.println(num1);
        System.out.println(num2);
        // System.out.println(num3); defult
        // System.out.println(num4); private
      }

}


public class accesmodifires {
    public static void main(String[] args) {
        Student s1 = new Student();
      
        // System.out.print(s.num4);  this is priveta
        System.out.println("packeage class use : \n");
        jaydipgym s =new jaydipgym();
        System.out.print(s.num1);
        // System.out.print(s.num2); no acess proteted
        // System.out.print(s.num3); no access deflut

        subclass s2 = new subclass();
        s2.printdata();

        
        
    }
}
