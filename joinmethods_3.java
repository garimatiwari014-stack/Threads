 class medical extends Thread{
public void run(){
        try{
           System.out.println("Medical starts");
           Thread.sleep(3000);
           System.out.println("Medical finished");
           


        }catch(Exception e ){
            System.out.println(e);
        }
    }

}

 class TestDriver extends Thread {
    public void run(){
        try{
            System.out.println("Test is start");
            Thread.sleep(3000);
            
            System.out.println("Test is completed");

        }catch(Exception e ){
            System.out.println(e);

        }
    }

    
}
class office extends Thread {
    public void run(){
    try{
        System.out.println("Office file check ");
        Thread.sleep(3000);
        System.out.println("File is checked");

    }catch(Exception e ){
        System.out.println(e);
    }
    }
}

 public class joinmethods_3 extends Thread {
    public static void main(String [] args ) throws InterruptedException{
        medical m = new medical() ;
 
        m.start();
        m.join();

        TestDriver td = new TestDriver();
        td.start();
        td.join();
        office oc = new office();
        oc.start();

    }
}
