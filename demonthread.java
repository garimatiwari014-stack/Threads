
    class DemonThread extends Thread{
        public void run(){
            System.out.println("Hello I am demon thread ");

        }
        public static void main(String[] args){
            System.out.println("The demon thread work on me");
            DemonThread t = new DemonThread();
            t.setDaemon(true);
            t.start();
        }
    }

