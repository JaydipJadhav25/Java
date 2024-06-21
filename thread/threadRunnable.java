// package thread;
class Mythr1 implements Runnable{
    public void run(){
        for(int i =0 ; i<1000 ; i++){
        System.out.println("this is threading 1..........");

        }
    }
}
class Mythr2 implements Runnable{
    public void run(){
        for(int i =0 ; i<1000 ; i++){
        System.out.println("this is threading 2!!!!!!!!!!!!!!!!!!");

        }
    }
}
public class threadRunnable {
    public static void main(String[] args) {
        System.out.println(" this is Runnable implemantasion..");
        Mythr2 bullt1 = new Mythr2();
        Mythr1 bullt2 = new Mythr1();

        Thread gun1 = new Thread(bullt1);
        Thread gun2 = new Thread(bullt2);

        gun1.setPriority(Thread.MAX_PRIORITY);
        gun2.setPriority(Thread.MIN_PRIORITY);

        gun1.start();
        gun2.start();


    }

}
