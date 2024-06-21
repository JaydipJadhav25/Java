// package thread;
class Mythr extends Thread{
   public Mythr(String name){
        super(name);
    }
    public void run(){
        for(int i =0 ; i<5; i++){
        System.out.println("this is threading 1..........");

        }
    }
};
// class Mythrrunnable implements Runnable{
//     public Mythrrunnable(Runnable r){

       

//     }
// }
public class constructor {
   
    public static void main(String[] args) {
        Mythr t = new Mythr("jaydip");
        // System.out.println("id of the thread : "+t.getId(););/
        System.out.println("id of the thread : "+t.getName());

       
        t.start();

        

    }
    
}
