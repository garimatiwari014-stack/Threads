public class SingleTaskFromMultipleThreads extends Thread {
     @Override
    public void run(){
        System.out.println("Hello Thread .. By Multiple Threads from  a single task ");
    }
    public  static void main(String [] args){
        SingleTaskFromMultipleThreads ts = new SingleTaskFromMultipleThreads();
        ts.start();
        SingleTaskFromMultipleThreads ts2 = new SingleTaskFromMultipleThreads();
        ts2.start();
    }
}
