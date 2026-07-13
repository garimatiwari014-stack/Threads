 class sleepmethod {
    public static void main(String[] args){
        System.out.println("Sleep Method");
    
        for(int i = 0 ; i <= 5 ; i++){
        try{  
            Thread.sleep(1000);
            System.out.println(i);
        
    }catch(Exception e){
           System.out.println(e);
    }
    }

    }

}



