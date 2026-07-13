

public class joinmethods_1 extends Thread {
    public void run(){
        try {
            for(int i = 0 ; i <= 5 ; i++){
                System.out.println(Thread.currentThread().getName() + i);
                  Thread.sleep(1000);

            }
        } catch ( Exception e) {
            System.out.println(e);

        }
    }
    public static void main(String [] args)throws InterruptedException{
        joinmethods_1 jd = new joinmethods_1();
        jd.start();
       // jd.join();
        try{
        for(int i = 0 ; i<=5 ; i++){
            System.out.println(Thread.currentThread().getName()  + i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e ){
        System.out.println(e);
    }}

    }
    

