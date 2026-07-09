

public class runnableExample implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello  Thread . I was created by Runnable interface ");
    }
    public static void main(String[] args){
        runnableExample t = new runnableExample();
        Thread th = new Thread(t);
        th.start();
    }
}


