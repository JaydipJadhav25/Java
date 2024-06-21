
import java.util.*;


class Student {
    String name;
    int age;
    int a ;

    // construter 
    Student(){
        //defult

    }
    //parametrical con..
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //copy construter
    Student(Student s){
        this.name = s.name;
        this.age = s.age;

    }
    Student(int a){
        System.out.println(a);
    }
    
    public void printInfo() {
        System.out.println(name+" "+age);

    }
    public void printInfo(int a) {
        System.out.println(a);

    }
    public void printInfo(int a , float b ) {
        System.out.println(a +" ,"+b );

    }
 ///super keyword

};

class Newclass extends Student{
    Newclass(int a){
        super(a);
        System.out.print("i am extrended construter :");

    }
   

 }

public class oops {
    public static void main(String[] args) {
        System.out.println("classs and objects, construter");
        Student s1 = new Student("jaydip", 20);
        Student s2 = new Student(s1);
    
        s1.printInfo();
        s2.printInfo();
        s2.printInfo(10);
        s2.printInfo(10  , 10);

        //super
  
        Newclass n = new Newclass(5);
        n.printInfo();



    }
}
