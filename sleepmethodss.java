public class sleepmethodss {
    public void run(){
        for(int i = 0 ; i <=5 ; i++){
            try{
                Thread.sleep(1000, -1);
                System.out.println(i);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        }public static void main(String [] args){
            sleepmethodss t1 = new sleepmethodss();
            t1.run();
            
        
    }
}
