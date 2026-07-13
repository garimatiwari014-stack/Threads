public class threadPriority extends Thread{
    public void run(){
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
    public static void main(String [] args){
        threadPriority t1 = new threadPriority();
        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(8);
        t1.start();

    }
}
