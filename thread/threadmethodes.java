class Mythr1 extends Thread{
    public void run(){
        for(int i =0 ; i<3 ; i++){
        System.out.println("this is threading 1..........");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception");
            e.printStackTrace();
        }

        }
    }
};
class Mythr2 extends Thread{
    public void run(){
        for(int i =0 ; i<10 ; i++){
            System.out.println("this is threading 2 !!!!!!!!!!!!!!!!!!!!!");
    
            }
    }
};


public class threadmethodes {
    public static void main(String[] args) {
       System.out.println("hello"); 
       Mythr1 t1 = new Mythr1();
       Mythr2 t2 = new Mythr2();

       System.out.println("thread id live : "+t1.isAlive());
       t1.start();
    //    for(int i = 0; i<4;i++){
    //     try {
    //         t1.join();
    //         System.out.println("1111111111111111111111111111111111111111111");
    //        } catch (InterruptedException e) {
    //         // TODO: handle exception
    //         System.out.println(e);
    //         e.printStackTrace();
    //        }
    //    }
       System.out.println("thread id live : "+t1.isAlive());
       

       t2.start();
      
    }
}
