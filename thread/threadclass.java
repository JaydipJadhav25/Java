// package thread;
class Mythr1 extends Thread{
    public void run(){
        for(int i =0 ; i<1000 ; i++){
        System.out.println("this is threading 1..........");

        }
    }
};
class Mythr2 extends Thread{
    public void run(){
        for(int i =0 ; i<1000 ; i++){
            System.out.println("this is threading 2 !!!!!!!!!!!!!!!!!!!!!");
    
            }
    }
};


public class threadclass {
    public static void main(String[] args) {
        System.out.println("...........threading..........");
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        // t1.run();
        // t2.run();// run kelya vr thread run zal nhi noramly work zal
        t1.start();
        t2.start();

    }
}
