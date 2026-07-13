
public class multipletaskwithsleep extends Thread {
     public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                System.out.println(i + " Thread Name: " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);


            }
        }
        }
        public static void main(String [] args){
            multipletaskwithsleep t1 = new multipletaskwithsleep();
           // t1.start();
           t1.run();
            multipletaskwithsleep t2 = new multipletaskwithsleep();
           // t2.start();
           t2.run();
        }
    }

