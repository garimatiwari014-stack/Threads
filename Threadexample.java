public class Threadexample extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, Thread");
    }

    public static void main(String[] args) {
        Threadexample t = new Threadexample();
        t.start();   // run() method ko naye thread me execute karega
    }
}