public class yieldmethod extends Thread  {
    public void run(){
        for(int i = 0 ; i <=5 ; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+":" + i);
        }
    }
    public static void main(String [] args){
        yieldmethod t = new yieldmethod();
        t.start();
       // Thread.yield();

        for(int i = 0 ; i <= 5 ; i++){
            System.out.println(Thread.currentThread().getName() +":"+ i);
        }
    }
    
}
