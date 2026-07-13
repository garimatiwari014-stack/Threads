

  class multiplethreads extends Thread{
    @Override
    public void run(){
        System.out.println("Task-1");
    }
}

 class mythreads2 extends Thread{
    @Override
    public void run(){
        System.out.println("Task-2");
    }
}


public class Multiple_Threads{
    public static void main(String[] args) {
        multiplethreads t1 = new multiplethreads();
        t1.start();
        mythreads2 t2 = new mythreads2();
        t2.start();
    }
}