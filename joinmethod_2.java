public class joinmethod_2 extends Thread {
    static  Thread mainthread;
    public void run() {
            // mainthread.join();
             try {
                 for(int i = 0 ; i <=5 ; i ++){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                 }
             } catch (Exception e) {
                System.out.println(e);
             }
    }
    public static void main(String [] args){
        mainthread = Thread.currentThread();
       
        joinmethod_2 jd = new joinmethod_2();
        jd.start();
        try {
            for(int i = 0 ; i <= 5; i++){
                System.out.println(Thread.currentThread().getName() + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
